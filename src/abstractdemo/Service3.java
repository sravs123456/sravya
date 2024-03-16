package abstractdemo;

public class Service3 extends Calculation{
    @Override
    public int Add(int a, int b) {
        int add=a+b;
        System.out.println(add);
        return add;
    }

    @Override
    public int Sub(int a, int b) {
        int sub=a-b;
        System.out.println(sub);
        return sub;
    }

    @Override
    public int Division(int a, int b) {
        int div=a%b;
        System.out.println(div);
        return div;
    }
}
