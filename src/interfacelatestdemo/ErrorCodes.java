package interfacelatestdemo;

public enum ErrorCodes {
    NEOTERIC_ERROR_1000("NEO_IV_1000", "INVALID OTP"),
    NEOTERIC_EXPIRE_OTP_1001("NEOTECH_EX_1001","EXPIRED OTP");
    String code;
    String message;
    ErrorCodes(String erroCode,String message){
        this.code=erroCode;
        this.message=message;
    }
    public String getCode(){
        return code;

    }
    public String getMessage(){
        return message;
    }
}
