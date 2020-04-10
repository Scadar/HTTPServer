package ru.scadarnull.http.io.exception;

public class HttpVersionNotSupportedException extends AbstractRequestParseException{

    private static final long serialVersionUID = 1158827212760115781L;

    public HttpVersionNotSupportedException(String message, String startingLine) {
        super(message, startingLine);
        setStatusCode(505);
    }

}
