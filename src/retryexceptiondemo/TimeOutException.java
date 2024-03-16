package retryexceptiondemo;

public class TimeOutException extends RuntimeException {

        private String errorCode;
        private String errorMessage;

        public TimeOutException(String errorCode, String message) {
            super(message);
            this.errorCode = errorCode;
            this.errorMessage = message;
        }
    }
