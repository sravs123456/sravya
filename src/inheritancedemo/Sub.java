package inheritancedemo;

public class Sub extends Add {
//    private int c;
//    private int d;
//        public Sub(int a,int b,int c,int d){
//        super( a, b);
//        this.c=c;
//        this.d=d;
//
//    }
    public int Sub(int a,int b, int c, int d) {
        int sub = a - b- c- d;
        return sub;
    }

//    @Override
//    public String toString() {
//        return "Sub{" +
//                "c=" + c +
//                ", d=" + d +
//                ", a=" + a +
//                ", b=" + b +
//                '}';
    }

