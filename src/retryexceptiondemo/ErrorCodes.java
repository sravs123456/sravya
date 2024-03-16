package retryexceptiondemo;

public enum ErrorCodes {
    INSUFFICIENT_FUNDS_EXCEPTION_ERROR_CODE("1000","Insufficient funds Exception"),
    TimeOutException_ERROR_CODE("1001","TimeOut Exception");

    private String code;
    private String message;
    ErrorCodes(String code,String message){
        this.code=code;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
