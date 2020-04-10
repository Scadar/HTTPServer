package ru.scadarnull.http.io.config;

import ru.scadarnull.http.io.HttpRequest;
import ru.scadarnull.http.io.exception.HttpServerException;

import java.io.IOException;
import java.io.InputStream;

public interface HttpRequestParser {
    HttpRequest parseHttpRequest(InputStream in, String remoteAddress) throws IOException, HttpServerException;
}
