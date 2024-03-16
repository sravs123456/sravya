package abstractdemo;

import inheritancedemo.Add;

public class Test {
    public static void main(String[] args) {
//        Service2 s=new Service2();
//       int a= s.Division(4,2);
//        System.out.println(a);
        Service3 service3=new Service3();
        int result=service3.Add(3,4);
        System.out.println(result);
      int result1=  service3.Sub(4,2);
        System.out.println(result1);
       int result3= service3.Division(6,12);
        System.out.println(result3);








    }
}
