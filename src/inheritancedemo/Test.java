package inheritancedemo;

public class Test {
    public static void main(String[] args) {
        Add add = new Add();
       int result= add.add(3,3);
        System.out.println(result);

        Sub sub = new Sub();
        int result1=sub.Sub(8,4,1,1);
        System.out.println(result1);
    }
}