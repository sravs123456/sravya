package constructoroverloading;

public class Product{
    public String productName;
    public String size;
     public Apps apps;

    public Product(String productName,String size,Apps apps) {
        this.productName = productName;
        this.size= size;
        this.apps=apps;

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", size='" + size + '\'' +
                ", apps=" + apps +
                '}';
    }

    public Product(String productName, String size){
        this(productName,size,new Apps());


    }



}
