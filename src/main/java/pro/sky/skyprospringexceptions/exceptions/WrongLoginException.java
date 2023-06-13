package pro.sky.skyprospringexceptions.exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }
}
