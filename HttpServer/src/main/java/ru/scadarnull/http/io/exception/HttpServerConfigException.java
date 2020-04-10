package ru.scadarnull.http.io.exception;

public class HttpServerConfigException extends HttpServerException{
    private static final long serialVersionUID = 5745709021586696751L;

    public HttpServerConfigException(String message) {
        super(message);
    }

    public HttpServerConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpServerConfigException(Throwable cause) {
        super(cause);
    }
}
