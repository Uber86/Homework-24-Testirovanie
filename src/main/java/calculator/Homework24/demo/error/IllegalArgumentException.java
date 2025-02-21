package calculator.Homework24.demo.error;

public class IllegalArgumentException extends RuntimeException{
    public IllegalArgumentException() {
    }

    public IllegalArgumentException(String message) {
        super("Ошибка инициализации");
    }

    public IllegalArgumentException(String message, Throwable cause) {
        super("Ошибка инициализации", cause);
    }
}
