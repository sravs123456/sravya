package voterid;

import java.util.Calendar;

public abstract  class Verification implements Registration,VoteChecking,Polling{
    DataBase dataBase;
    String adharNumDb="123456";
    public Verification(){
        this.dataBase=new DataBase();
    }

    @Override
    public boolean registration(String name, int dob, String adharNum, String gender) {
        if (dataBase.getAdharNum().equals(adharNum)) {
            System.out.println("registration successfull");
            return true;
        }else {
            System.out.println("registration failed");
        }
        return false;
    }

    @Override
    public boolean voterChecking(String adharNum,int dob) {
        int age= Calendar.getInstance().getWeekYear()-dob;
        if(age>=18){
            System.out.println("valid voterid");
            return true;
        }else {
            System.out.println("invalid voterid");
        }
        return false;

    }


}



