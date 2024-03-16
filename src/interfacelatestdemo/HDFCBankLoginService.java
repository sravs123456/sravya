package interfacelatestdemo;

public class HDFCBankLoginService implements BankLoginService{
    String accountNum="2222";
    String password="1234";
    @Override
    public boolean login(String userName, String password) {
        if(userName.equals(accountNum) && this.password.equals(password)){
            return true;
        }
        return false;
    }
}
