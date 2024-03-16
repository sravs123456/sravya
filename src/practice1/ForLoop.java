package practice1;

public class ForLoop {
    int a=5;
    int b=3;
    public int add() {
        int c = a + b;
        for (int i = 1; i <= 10; i++) {
            System.out.println(c);
        }
        return c;
    }
    public int sub(){
        int c=a-b;
        int i=0;
        while ( i<=10) {
            System.out.println(c);
            i++;
        }
         return c;
        }
    public static void main(String[] args) {
        ForLoop a =new ForLoop();
        a.add();
        System.out.println(" ");
        a.sub();
    }

}

