package polymorphism;

public class Add1 extends Addition{
    @Override
    public int addition(int a, int b, int c, int d) {
        int result1=a+b+c+d;
        System.out.println(result1);
        return result1;
    }
}
