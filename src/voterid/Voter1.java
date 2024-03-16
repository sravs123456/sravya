package voterid;

public class Voter1 extends Verification{
    @Override
    public boolean polling(String partyName) {
        System.out.println("voted for:"+ partyName);
        return true;
    }
}
