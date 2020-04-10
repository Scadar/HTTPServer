package ru.scadarnull.http.io.exception;

public class BadRequestException extends AbstractRequestParseException{
    private static final long serialVersionUID = 1668296366558793850L;

    public BadRequestException(String message, Throwable cause, String startingLine) {
        super(message, cause, startingLine);
        setStatusCode(400);
    }

}
