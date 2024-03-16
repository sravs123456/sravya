package customeexception;

public enum ErrorCode {
    INVALID_VOTE("INVALID_VOTE","YOU ARE ELIGIBLE FOR VOTE");

    private String code;
 private String message;
 ErrorCode(String code,String message){
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



