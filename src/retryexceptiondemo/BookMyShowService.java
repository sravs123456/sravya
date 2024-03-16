package retryexceptiondemo;

public class BookMyShowService {
    public void bookTicket() {
        try {
            SBIService sbiService = new SBIService();
            sbiService.transfer();
        } catch (TimeOutException timeOutException) {
            System.out.println("Error Occured" + timeOutException);
        }
    }
}