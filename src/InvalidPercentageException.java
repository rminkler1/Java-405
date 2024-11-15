public class InvalidPercentageException extends Exception {
    InvalidPercentageException(double percentage) {
        super("Invalid percentage " + percentage + "%. Valid values are from 0 - 100");
    }
}
