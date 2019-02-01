package Shapes;

/**
 *  An exception class that is thrown when a shape with more than required arguments is sent
 */
public class TooManyParameters extends Exception {
    public TooManyParameters(String message) {
        super(message);
    }

    public TooManyParameters(String message, Throwable throwable) {
        super(message, throwable);
    }


}
