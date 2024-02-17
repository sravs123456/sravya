package constructoroverloading;

public class Apps {
    public String appName;
    public int cost;
    public String deliveryDate;

    @Override
    public String toString() {
        return "Product{" +
                "appName='" + appName + '\'' +
                ", cost=" + cost +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }

    public Apps() {
        this.appName = "Ajio";
        this.cost = 1500;
        this.deliveryDate = "26/02/2023";
    }

    }