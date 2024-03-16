package fasttagversion;
import fasttagversion.model.InsufficentWalletBalance;

    public interface FastTagPayment {
        double payment() throws InsufficentWalletBalance;
    }

