package singletondemo;

import upcasting.D;

public class SingleTonTest {
    public static void main(String[] args) {
        System.out.println("from main");
        DBConnection dbConnection=DBConnection.getInstance();
        System.out.println(dbConnection.d);
        dbConnection.d=20;
        System.out.println(dbConnection.d);
        DBConnection dbConnection1=DBConnection.getInstance();
        System.out.println(dbConnection.d);
        dbConnection.d=40;
        System.out.println(dbConnection.d);
        DBConnection dbConnection2=DBConnection.getInstance();
        System.out.println(dbConnection.d);
        dbConnection.d=60;
        System.out.println(dbConnection.d);
        System.out.println(dbConnection.hashCode());
        System.out.println(dbConnection1.hashCode());
        System.out.println(dbConnection2.hashCode());



    }
}
