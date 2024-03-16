package exception;

public class ExceptionService {
    public String greet(String input){
        String uppercase=null;
        try {
            uppercase=input.toUpperCase();

        }finally {
            System.out.println("from finally block without catch block");
        }
        return uppercase;
    }
}
