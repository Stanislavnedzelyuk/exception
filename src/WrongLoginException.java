package src;

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
