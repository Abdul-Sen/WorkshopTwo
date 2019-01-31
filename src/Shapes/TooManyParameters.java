package Shapes;

public class TooManyParameters extends Exception {
    public TooManyParameters(String message) {
        super(message);
    }

    public TooManyParameters(String message, Throwable throwable) {
        super(message, throwable);
    }


}
