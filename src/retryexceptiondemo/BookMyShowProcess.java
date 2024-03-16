package retryexceptiondemo;

import upcasting.B;

public class BookMyShowProcess {
    public void bookTicket(){
        try {
            BookMyShowService service = new BookMyShowService();
            service.bookTicket();

        }catch (Exception e){
            System.out.println("Error Occured" +e);

        }finally {
            System.out.println("Book Ticket From Finnaly Excuted");
        }



    }


}
