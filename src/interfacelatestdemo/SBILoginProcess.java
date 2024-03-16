package interfacelatestdemo;

import java.util.UUID;

public class SBILoginProcess implements BankLoginService {
    SbiLoginService sbiLoginService;

    public SBILoginProcess() {
        sbiLoginService = new SbiLoginService();
        this.sbiLoginService = new SbiLoginService();

    }
    public SBILoginProcess(SbiLoginService sbiLoginService) {
        this.sbiLoginService = new SbiLoginService();
    }


        @Override
        public boolean login (String username, String password){
            if (sbiLoginService.login(username, password)) {
                String otp = sbiLoginService.generateOTP(username);
                boolean validOtp = false;
                try {
                    validOtp = sbiLoginService.validationOTP(UUID.randomUUID().toString());
                } catch (InvalidOtpException e) {
                    System.out.println("Error Occured" + e);
                    throw new InvalidRuntimeOTPException(e.getCode(),e.getMessage());
                }catch (Exception e){
                }
                if (validOtp) {
                    System.out.println("valid otp & login is successfull");
                } else {
                    System.out.println("invalid otp & login failed");
                }
                return validOtp;
            } else {
                System.out.println("invalid credential");
             return false;
            }
        }
    }