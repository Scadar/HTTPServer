package ru.scadarnull.http.io.exception;

public class MethodNotAllowedException extends AbstractRequestParseException {
    private static final long serialVersionUID = 1645796818476582454L;

    public MethodNotAllowedException(String method, String startingLine) {
        super("Only " + Constants.ALLOWED_METHODS + "are supported. Current method is " + method, startingLine);
        setStatusCode(405);
    }
}
