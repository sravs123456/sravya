package abstractdemo;

public abstract class Service extends Calculation{
    @Override
    public int Add(int a, int b) {
        int Add=a+b;
        System.out.println(Add);
        return Add;
    }

    @Override
    public int Sub(int a, int b) {
        int Sub=a-b;
        System.out.println(Sub);
        return Sub;
    }
}
