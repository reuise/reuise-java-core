package dev.reuise.core.carousel;

import java.util.ArrayList;
import java.util.List;

/** Measured logical card bounds, independent of browser scrolling and RTL scroll conventions. */
public final class CarouselPages {
    private final List<Integer> starts = new ArrayList<>();
    private final List<Integer> ends = new ArrayList<>();
    private final List<Double> offsets = new ArrayList<>();

    public CarouselPages(double[] positions, double[] widths, double viewport, Integer groupSize,
            String align, boolean whitespace) {
        if (positions.length != widths.length || !Double.isFinite(viewport) || viewport < 0
                || (groupSize != null && groupSize < 1))
            throw new IllegalArgumentException("Invalid carousel measurements");
        if (!"start".equals(align) && !"center".equals(align) && !"end".equals(align))
            throw new IllegalArgumentException("Invalid carousel alignment");
        double total = widths.length == 0 ? 0 : positions[widths.length - 1] + widths[widths.length - 1];
        if (widths.length > 0 && total <= viewport + .5) {
            double offset = positions[0];
            double width = total - positions[0];
            if ("center".equals(align)) offset -= (viewport - width) / 2;
            else if ("end".equals(align)) offset -= viewport - width;
            starts.add(0);
            ends.add(widths.length);
            offsets.add(whitespace ? offset : 0);
            return;
        }
        for (int first = 0; first < widths.length;) {
            int end = first + 1;
            if (groupSize != null) end = Math.min(widths.length, first + groupSize);
            else while (end < widths.length
                    && positions[end] + widths[end] - positions[first] <= viewport + .5) end++;
            double width = positions[end - 1] + widths[end - 1] - positions[first];
            double offset = positions[first];
            if ("center".equals(align)) offset -= (viewport - width) / 2;
            else if ("end".equals(align)) offset -= viewport - width;
            if (!whitespace) offset = Math.max(0, Math.min(Math.max(0, total - viewport), offset));
            addPage(first, end, offset, viewport, positions, widths);
            first = end;
        }
        if (!offsets.isEmpty() && total - viewport > offsets.get(offsets.size() - 1) + .5)
            addPage(starts.get(starts.size() - 1), widths.length, total - viewport, viewport, positions, widths);
    }

    private void addPage(int first, int end, double offset, double viewport, double[] positions, double[] widths) {
        if (offsets.isEmpty() && offset > .5) {
            starts.add(first);
            ends.add(end);
            offsets.add(0d);
        }
        if (!offsets.isEmpty()) {
            int last = offsets.size() - 1;
            double previous = offsets.get(last);
            if (Math.abs(offset - previous) <= .5) {
                ends.set(last, end);
                return;
            }
            while (viewport > .5 && offset - previous > viewport + .5
                    && hasContentBetween(starts.get(last), end, previous + viewport, offset, positions, widths)) {
                previous += viewport;
                starts.add(starts.get(last));
                ends.add(ends.get(last));
                offsets.add(previous);
            }
        }
        starts.add(first);
        ends.add(end);
        offsets.add(offset);
    }

    private boolean hasContentBetween(int first, int end, double left, double right,
            double[] positions, double[] widths) {
        for (int i = first; i < end; i++)
            if (positions[i] + widths[i] > left + .5 && positions[i] < right - .5) return true;
        return false;
    }

    public int size() { return starts.size(); }
    public int first(int page) { return starts.get(page); }
    public int end(int page) { return ends.get(page); }
    public double offset(int page) { return offsets.get(page); }
}
