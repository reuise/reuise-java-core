package dev.reuise.core;

import java.util.zip.Adler32;

public class ComponentUtils {
    private static int counter = 1986;

    private static final char[] BASE32_CHARS = new char[] {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', '-', '0', '1',
            '2', '3', '4', '5' };

    public static String generateRandomString() {
        //Adler32 hash = new Adler32();
        counter++;
        return makeIdent(counter);
    }

    private static String makeIdent(long id) {
        assert id >= 0;

        StringBuilder b = new StringBuilder();

        // Use only guaranteed-alpha characters for the first character
        b.append(BASE32_CHARS[(int) (id & 0xf)]);
        id >>= 4;

        while (id != 0) {
            b.append(BASE32_CHARS[(int) (id & 0x1f)]);
            id >>= 5;
        }

        return b.toString();
    }
}
