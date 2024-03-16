package interfacelatestdemo;

public class SBILoginTest {
    public static void main(String[] args) {
        BankLoginService loginService=new SBILoginProcess();
        try {
            boolean loginStatus = loginService.login("1234567", "09865");
            if (loginStatus) {
                System.out.println("Login Success");
            } else {
                System.out.println("Login Failed");

            }
        }catch (InvalidRuntimeOTPException e){
            System.out.println(e.getCode()+ "   " +e.getMessage());

        }

    }
}
