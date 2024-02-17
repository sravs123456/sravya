public class GmailLogin{
       boolean login(Gmail gmail){
        String localuserName="sravya@gmail.com";
        String localpassword="sravya";

        if(localuserName.equals(gmail.userName) && localpassword.equals(gmail.password)) {
            return true;
        }else{
            return false;
        }
    }
}
