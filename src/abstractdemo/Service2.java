package abstractdemo;

public class Service2 extends Service{
    @Override
    public int Division(int a, int b) {
        int Div=a%b;
        System.out.println(Div);
        return Div;
    }
}
