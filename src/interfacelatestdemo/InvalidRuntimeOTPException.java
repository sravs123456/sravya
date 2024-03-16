package interfacelatestdemo;

public class InvalidRuntimeOTPException extends RuntimeException {
    public String getCode() {
        return code;
    }

    String code;
    public InvalidRuntimeOTPException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }
}
