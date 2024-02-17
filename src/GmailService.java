public class GmailService {
    public String touserName;
    public String userName;

    public String sendMessage(String userName, String touserName) {
        String fromMailId = "sravya@gmail.com";
        String toMailId = "raji@gmail.com";
        if (fromMailId.equals(userName) &&  toMailId.equals(touserName)) {
            return "hello";
        } else {
            return "email doesnt match";
        }

    }
}
