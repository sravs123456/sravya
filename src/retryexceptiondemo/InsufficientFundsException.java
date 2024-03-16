package retryexceptiondemo;

public class InsufficientFundsException extends RuntimeException {
    private String errorCode;
    private String errorMessage;
    public InsufficientFundsException(String errorCode,String message){
        super(message);
        this.errorCode=errorCode;
        this.errorMessage=message;
    }
}
