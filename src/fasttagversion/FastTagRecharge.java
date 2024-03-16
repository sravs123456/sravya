package fasttagversion;
import fasttagversion.model.InvalidIdException;

public interface FastTagRecharge {

        String recharge(String fastTagID,double amount) throws InvalidIdException;

}
