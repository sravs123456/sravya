public class Productprocess {
    int orderItems;
    int bags = 1500;
    int totalPrice;

    public int items(Products products) {
        //int orderItems=0;
        if (orderItems < products.bags) {
            orderItems = orderItems + products.bags;
            totalPrice = orderItems * bags;
            System.out.println("Total price:" + " " + totalPrice);
        } else {
            System.out.println("Add items");
        }
        return orderItems;
    }
}
