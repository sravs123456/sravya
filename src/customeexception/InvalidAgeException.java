package customeexception;

public class InvalidAgeException extends Exception {
    String code;
    public InvalidAgeException(String errorcode,String message){
        super(message);
        this.code=errorcode;

    }
    public String getCode(){
        return code;
    }
}
