package interfacelatestdemo;

public class InvalidOtpException extends Exception {
        private String code;

    public String getCode() {
        return code;
    }

    public InvalidOtpException(String errorCode, String message){
            super(message);
            this.code=errorCode;
        }

}
