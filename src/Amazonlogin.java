public class Amazonlogin {
    boolean login(Amazondetails details){
        String localuserName="sravya";
        String localpassword="sravs";
        if(localuserName.equals(details.userName) && localpassword.equals(details.password)) {
            return true;
        }else{
            return false;
        }
    }
}

