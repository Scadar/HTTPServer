package ru.scadarnull.http.io.impl;

import ru.scadarnull.http.io.HttpRequest;
import ru.scadarnull.http.io.config.HttpRequestParser;
import ru.scadarnull.http.io.exception.HttpServerException;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

class DefaultHttpRequestParser implements HttpRequestParser {
    private static final String CONTENT_LENGTH = "content-length: ";
    @Override
    public HttpRequest parseHttpRequest(InputStream in, String remoteAddress) throws IOException, HttpServerException {

        return null;
    }
}
