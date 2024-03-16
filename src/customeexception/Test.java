package customeexception;

public class Test {
    public static void main(String[] args) {
        VoteVerification voteVerification=new VoteVerification();
        try{
            voteVerification.verify(17);

        }
        catch (InvalidAgeException exception){
            System.out.println(exception.getCode());
        }
        finally {
            System.out.println("thankyou");
        }
    }
}
