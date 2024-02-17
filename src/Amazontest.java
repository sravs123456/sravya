public class Amazontest {
    public static void main(String[] args) {
        Amazonlogin amazonlogin = new Amazonlogin();
        Amazondetails amazondetails = new Amazondetails();
        amazondetails.userName = "sravya";
        amazondetails.password = "sravs";
        boolean loginStatus = amazonlogin.login(amazondetails);
        System.out.println(loginStatus);
        if(loginStatus){
            Productprocess productprocess=new Productprocess();
            Products products=new Products();
            products.bags=3;
            int itemsAdded=productprocess.items(products);
            System.out.println("Total Items:"+" "+itemsAdded);
        }
    }
}
