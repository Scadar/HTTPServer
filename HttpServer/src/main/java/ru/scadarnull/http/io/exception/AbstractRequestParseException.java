package ru.scadarnull.http.io.exception;

public abstract class AbstractRequestParseException extends HttpServerException {
    private static final long serialVersionUID = 2395709894168344101L;
    private final String startingLine;

    public AbstractRequestParseException(String message, String startingLine) {
        super(message);
        this.startingLine = startingLine;
    }

    public AbstractRequestParseException(String message, Throwable cause, String startingLine) {
        super(message, cause);
        this.startingLine = startingLine;
    }

    public AbstractRequestParseException(Throwable cause, String startingLine) {
        super(cause);
        this.startingLine = startingLine;
    }


    public String getStartingLine() {
        return startingLine;
    }
}
