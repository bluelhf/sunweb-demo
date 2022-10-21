package blue.lhf.sunweb_demo.utils;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HttpUtils {
    private HttpUtils() {
        // Never instantiate utility classes
    }

    public static void respondPlaintext(final HttpExchange exchange,
                                        final int responseCode,
                                        final String response) throws IOException {
        exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=utf-8");
        respond(exchange, responseCode, response.getBytes(StandardCharsets.UTF_8));
    }
    public static void respond(final HttpExchange exchange,
                               final int responseCode,
                               final byte[] response) throws IOException {

        exchange.sendResponseHeaders(responseCode, response.length);

        try (final var output = exchange.getResponseBody()) {
            output.write(response);
        }
    }
}