package staticdemo;

public class Test {
    public static void main(String[] args) {
        String message =StaticDemo.helloWorld();
        System.out.println(message);
        StaticDemo staticDemo=new StaticDemo();
        System.out.println("Static" +staticDemo.i);
        System.out.println("Instance" +staticDemo.j);
        StaticDemo.i=100;
        staticDemo.j=100;
        System.out.println("Static" +staticDemo.i);
        System.out.println("Static"+staticDemo.j);
        StaticDemo staticDemo1 =new StaticDemo();
        System.out.println(staticDemo1.i);
        System.out.println(staticDemo1.j);
        staticDemo.i=200;
        staticDemo.j=200;
        System.out.println(staticDemo1.i);
        System.out.println(staticDemo1.j);
        StaticDemo staticDemo2=new StaticDemo();
        System.out.println(staticDemo2.i);
        System.out.println(staticDemo2.j);
        staticDemo.i=300;
        staticDemo.j=300;
        System.out.println(staticDemo2.i);
        System.out.println(staticDemo2.j);

    }
}
