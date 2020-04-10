package ru.scadarnull.http.io.config;

import ru.scadarnull.http.io.HttpServerContext;
import ru.scadarnull.http.io.ServerInfo;

import java.net.Socket;
import java.util.concurrent.ThreadFactory;

public interface HttpServerConfig {
    ServerInfo getServerInfo();

    String getStatusMessage(int statusCode);

    HttpRequestParser getHttpRequestParser();

    HttpResponseBuilder getHttpResponseBuilder();

    HttpResponseWriter getHttpResponseWriter();

    HttpServerContext getHttpServerContext();

    HttpRequestDispatcher getHttpRequestDispatcher();

    ThreadFactory getWorker();

    HttpClientSocketHandler buildNewHttpClientSocketHandler(Socket clientSocket);
}
