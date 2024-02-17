public class CardProcessTest {
    public static void main(String[] args){
        CardProcessingService processservice=new CardProcessingService();
        Carddetails cardDetails=new Carddetails();
        cardDetails.cardNumber="1234 1234 1234";
        cardDetails.pinNumber="1234";
        System.out.println(cardDetails.hashCode());
        boolean loginstatus=processservice.login(cardDetails);
        CreditService creditService=new CreditService();
        if(loginstatus){
            int balance= creditService.credit("1234 1234 1234",100);
            System.out.println(balance);
            System.out.println("creditService hashcode"+creditService.hashCode());
            int balance2= creditService.credit("1234 1234 1234",100);
            System.out.println("CreditSevice hashcode"+creditService.hashCode());
            System.out.println(balance2);

        }
    }
}
