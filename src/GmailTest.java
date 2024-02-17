public class GmailTest {
    public static void main(String[] args) {
        GmailLogin maillogin  =new GmailLogin();
        Gmail gmail =new Gmail();
        gmail.userName ="sravya@gmail.com";
        gmail.password ="sravya";
        System.out.println(gmail.hashCode());
        GmailService gmailservice=new GmailService();
        gmailservice.userName ="sravya@gmail.com";
        gmailservice.touserName="raji@gmail.com";
        boolean loginstatus = maillogin.login(gmail);
        if(loginstatus){
            System.out.println(gmailservice.sendMessage("sravya@gmail.com","raji@gmail.com"));
        }
    }
}
