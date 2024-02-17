package protectorDemo;

public class Bag{
    protected String companyName;
    protected String color;
    protected String cost;
    protected String ratings;

    @Override
    public String toString() {
        return "Bag{" +
                "companyName='" + companyName + '\'' +
                ", color='" + color + '\'' +
                ", cost='" + cost + '\'' +
                ", ratings='" + ratings + '\'' +
                '}';
    }

    public Bag(String companyName, String color, String cost, String ratings){
        this.companyName=companyName;
        this.color=color;
        this.cost=cost;
        this.ratings=ratings;
    }




















    }
