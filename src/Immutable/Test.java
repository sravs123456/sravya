package Immutable;

public class Test {
    public static void main(String[] args) {
        Fan fan=new Fan("Cromton","Green","300rmp");

       String name= fan.getComapnyName();
       System.out.println("fan details :"+name);
       String color=fan.getFanColor();
        System.out.println("fan color :"+color);
         fan.getFanSpeed();
        System.out.println("fan speed :"+fan.getFanSpeed());



    }
}
