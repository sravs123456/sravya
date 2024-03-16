package interfacelatestdemo;

import java.util.Date;
import java.util.UUID;
import java.util.Calendar;

public class SbiLoginService implements BankOTPValidationService {
    String accountNum = "2222";
    String password = "1234";
    String otp;
    Date otpExpireTime;


    @Override
    public boolean login(String userName, String password) {
        if (userName.equals(accountNum) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public String generateOTP(String accountNum) {
        if (this.accountNum.equals(accountNum)) {
            otp = UUID.randomUUID().toString();
            Calendar otpExpiryCalender = Calendar.getInstance();
            otpExpiryCalender.add(Calendar.SECOND, 60);
            System.out.println("otpExpiryCalender" + otpExpiryCalender.getTime());
            otpExpireTime = otpExpiryCalender.getTime();

            return otp;

        }
        return null;
    }

    @Override
    public boolean validationOTP(String otp) throws InvalidOtpException {
        if (this.otp.equals(otp)) {
            return true;

        } else {
            throw new InvalidOtpException(ErrorCodes.NEOTERIC_ERROR_1000.getCode(),
                    ErrorCodes.NEOTERIC_ERROR_1000.getMessage());
        }

    }
}

