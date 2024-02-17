package Schooldemo;

public class Schooltest {
    Student getschoolName(Student abc) {
        abc.schoolName = "chaitanyaschool";
        return abc;

    }
    Student getStudentAddress(Student abc){
    Student localschool=new Student();
    localschool.name=abc.name;
    localschool.fatherName=abc.fatherName;
    localschool.mobileNumber=abc.mobileNumber;
    localschool.dateOfBirth=abc.dateOfBirth;
    localschool.schoolName=abc.schoolName;


    Address address=new Address();
    address.street="kphb";
    address.city="hyd";
    address.state="ts";
    address.pinCode="521175";
    localschool.address=address;
    return localschool;









    }

    Student getSchoolNameDeepClone(Student abc) {
        Student cloneschool = new Student();
        cloneschool.name = abc.name;
        cloneschool.fatherName = abc.fatherName;
        cloneschool.mobileNumber = abc.mobileNumber;
        cloneschool.dateOfBirth = abc.dateOfBirth;
        cloneschool.schoolName = abc.schoolName;
        return cloneschool;
    }


    public static void main(String[] args){

      Student school=new Student();

        school.name="sravya";
        school.fatherName="suresh";
        school.mobileNumber="785632985";
        school.dateOfBirth="19022001";
        school.schoolName="chaitanyaschool";


      Schooltest schooltest=new Schooltest();

      Student latestschool = schooltest.getschoolName(school);
      System.out.println("Latestschool school"+latestschool.schoolName);
      System.out.println("School schoolName"+school.schoolName);



    }
}
