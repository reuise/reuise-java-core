package dev.reuise.core.chat;

import java.util.function.Consumer;

/**
 * Provider-neutral callbacks for a chat presentation. Applications retain ownership of transport,
 * cancellation, retries, human routing and the state displayed by the presentation.
 */
public final class ChatActions {
    private Consumer<String> send;
    private Runnable stop;
    private Runnable retry;
    private Runnable requestHuman;

    public ChatActions onSend(Consumer<String> handler) {
        send = handler;
        return this;
    }

    public ChatActions onStop(Runnable handler) {
        stop = handler;
        return this;
    }

    public ChatActions onRetry(Runnable handler) {
        retry = handler;
        return this;
    }

    public ChatActions onRequestHuman(Runnable handler) {
        requestHuman = handler;
        return this;
    }

    /** Returns false for blank input or when no handler is registered. */
    public boolean send(String text) {
        if (text == null || text.trim().isEmpty() || send == null) return false;
        send.accept(text);
        return true;
    }

    public boolean stop() {
        if (stop == null) return false;
        stop.run();
        return true;
    }

    public boolean retry() {
        if (retry == null) return false;
        retry.run();
        return true;
    }

    public boolean requestHuman() {
        if (requestHuman == null) return false;
        requestHuman.run();
        return true;
    }
}
