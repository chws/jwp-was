package http.exception;

public class NotFoundCookieException extends RuntimeException {
    public NotFoundCookieException() {
        super("Not Found Cookie");
    }
}
