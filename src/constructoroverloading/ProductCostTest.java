package constructoroverloading;

public class ProductCostTest {
    public static void main(String[] args){
        Apps apps=new Apps();
        apps.appName="Mintra";
        apps.cost=2000;

Product product=new Product("tops", "l");
System.out.println("tops details in Ajio="+product);
Product product1 =new Product("tshirt", "l");
System.out.println("tshirt details in Myntra="+product1);
    }
}
