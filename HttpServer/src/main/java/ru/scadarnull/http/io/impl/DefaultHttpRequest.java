package ru.scadarnull.http.io.impl;

import ru.scadarnull.http.io.HttpRequest;

import java.util.Collections;
import java.util.Map;

class DefaultHttpRequest implements HttpRequest {
    private final String method;
    private final String url;
    private final String httpVersion;
    private final String remoteAddress;
    private final Map<String, String> headers;
    private final Map<String, String> parameters;

    DefaultHttpRequest(String startingLine, String method, String url, String httpVersion, String remoteAddress, Map<String, String> headers, Map<String, String> parameters) {
        super();
        this.method = method;
        this.url = url;
        this.httpVersion = httpVersion;
        this.remoteAddress = remoteAddress;
        this.headers = Collections.unmodifiableMap(headers);
        this.parameters = Collections.unmodifiableMap(parameters);
    }

    @Override
    public String getStartingLine() {
        return String.format("%s %s %s", getMethod(),getUrl(), getHttpVersion());
    }

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getHttpVersion() {
        return httpVersion;
    }

    @Override
    public String getRemoteAddress() {
        return remoteAddress;
    }

    @Override
    public Map<String, String> getHeaders() {
        return headers;
    }

    @Override
    public Map<String, String> getParameters() {
        return parameters;
    }
}
