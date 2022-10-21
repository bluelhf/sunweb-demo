package blue.lhf.sunweb_demo;

import blue.lhf.sunweb_demo.utils.HttpUtils;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class API {
    public static class ToggleHandler implements HttpHandler {
        @Override
        public void handle(final HttpExchange exchange) throws IOException {
            HttpUtils.respondPlaintext(exchange, 200, "Toggled something");
        }
    }

    public static class PotatoHandler implements HttpHandler {

        // count potato requests
        final AtomicLong counter = new AtomicLong(0);

        @Override
        public void handle(final HttpExchange exchange) throws IOException {
            HttpUtils.respondPlaintext(exchange, 200, "potato " + counter.incrementAndGet());
        }
    }
}
