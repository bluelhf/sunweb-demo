package blue.lhf.sunweb_demo;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Path;

import com.sun.net.httpserver.SimpleFileServer;

import static java.lang.System.err;

public class App {
    public static final int PORT = 8008;

    public static void main(String[] args) throws IOException {
        // create on the defined port
        final HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

        // api contexts, if none match, look for a file instead
        server.createContext("/api/toggle", new API.ToggleHandler());
        server.createContext("/api/potato", new API.PotatoHandler());
        server.createContext("/", SimpleFileServer.createFileHandler(
                Path.of("content").toAbsolutePath())); // the program starts in ./app, so this is ./app/content

        // default executor :)
        server.setExecutor(null);

        err.printf("Starting on port %d%n", PORT);
        server.start();
    }
}