package voterid;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        int dob = 1999;
//        Verification verification=new Verification();
//        verification.registration("raji",1999,"123456","female");
//        verification.voterChecking("123456",1999);
        System.out.println(Calendar.getInstance().getWeekYear());
       int age= Calendar.getInstance().getWeekYear()-dob;
        System.out.println(age);
        Voter1 voter1=new Voter1();
        voter1.polling("janesena");
        voter1.voterChecking("123456",1999);
        voter1.registration("raji",1999,"123456","female");



        }
}
