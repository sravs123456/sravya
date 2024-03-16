package exception;

public class CustomExceptionService {
    public String checkedExceptino() {
        try{

        throw new Exception("Throw CheckException");
    }catch (Exception e) {
            throw new RuntimeException("Throw unCheckedException");
        }finally {
            System.out.println("From CheckedException method finally block");

                }
    }
}
