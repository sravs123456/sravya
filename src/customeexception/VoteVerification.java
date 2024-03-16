package customeexception;

import interfacelatestdemo.InvalidOtpException;

public class VoteVerification {

    public String verify(int age) throws InvalidAgeException{
        if (age >= 18) {
            System.out.println("eligible for vote");
        } else {
            throw new InvalidAgeException((ErrorCode.INVALID_VOTE.getCode()), ErrorCode.INVALID_VOTE.getMessage());

        }
        return "eligible for vote";
    }

}
