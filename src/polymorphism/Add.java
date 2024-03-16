package polymorphism;

public class Add extends Addition{
    @Override
    public int addition(int a, int b, int c, int d) {
        int result=a+b+c+d;
        System.out.println(result);
        return result ;
    }
}
