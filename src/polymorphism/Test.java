package polymorphism;

public class Test {
    public static void main(String[] args) {
        Add add=new Add();
       int a= add.addition(2,1,3,4);
        System.out.println(a);
        Add1 add1=new Add1();
       int b= add1.addition(4,1,6,1);
        System.out.println(b);

    }
}
