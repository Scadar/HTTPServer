package ru.scadarnull.http.io.impl;

import ru.scadarnull.http.io.HttpRequest;

import java.util.Map;

public class DefaultHttpRequest implements HttpRequest {
    private String startingLine;
    private String method;
    private String url;
    private String httpVersion;
    private String remoteAddress;
    private Map<String, String> headers;
    private Map<String, String> parameters;

    @Override
    public String getStartingLine() {
        return null;
    }

    public DefaultHttpRequest(String startingLine, String method, String url, String httpVersion, String remoteAddress, Map<String, String> headers, Map<String, String> parameters) {
        this.startingLine = startingLine;
        this.method = method;
        this.url = url;
        this.httpVersion = httpVersion;
        this.remoteAddress = remoteAddress;
        this.headers = headers;
        this.parameters = parameters;
    }

    @Override
    public String getMethod() {
        return null;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getHttpVersion() {
        return null;
    }

    @Override
    public String getRemoteAddress() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}
