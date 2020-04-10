package ru.scadarnull.http.io.config;

import ru.scadarnull.http.io.HttpResponse;

import java.util.Map;

public interface ReadableHttpResponse extends HttpResponse {
    int getStatus();

    Map<String, String> getHeaders();

    byte[] getBody();

    boolean isBodyEmpty();

    int getBodyLength();
}
