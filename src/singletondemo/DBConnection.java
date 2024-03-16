package singletondemo;

public class DBConnection  {
    private static final DBConnection dbConnection=new DBConnection();
    private DBConnection(){
        System.out.println("private Constructor");
    }
    int d=0;
    public static DBConnection getInstance(){
        return dbConnection;
    }
}
