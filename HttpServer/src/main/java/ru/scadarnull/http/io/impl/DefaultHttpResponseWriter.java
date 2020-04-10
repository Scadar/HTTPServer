package ru.scadarnull.http.io.impl;

import ru.scadarnull.http.io.config.HttpResponseWriter;
import ru.scadarnull.http.io.config.ReadableHttpResponse;

import java.io.IOException;
import java.io.OutputStream;

class DefaultHttpResponseWriter implements HttpResponseWriter {
    @Override
    public void writeHttpResponse(OutputStream out, ReadableHttpResponse response) throws IOException {

    }
}
