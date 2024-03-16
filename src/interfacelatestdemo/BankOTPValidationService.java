package interfacelatestdemo;

public interface BankOTPValidationService extends BankLoginService {
    String generateOTP(String accountNum);
    boolean validationOTP(String otp) throws Exception;
}
