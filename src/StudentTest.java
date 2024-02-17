public class StudentTest {
    String getRollNo(Student abc){
        return"";
    }
    public static void  main(String[] args){
        Student kiranstudent=new Student();
        Student sivastudent=new Student();
        kiranstudent.name="kiran";
        kiranstudent.fatherName="surya";
        kiranstudent.mobileNumber="7989363562";
        kiranstudent.dateofBirth="18052002";

        sivastudent.name="siva";
        sivastudent.fatherName="prasad";
        sivastudent.mobileNumber="9542633581";
        sivastudent.dateofBirth="19042001";
        StudentTest studenttest=new StudentTest();
        studenttest.getRollNo(kiranstudent);
        studenttest.getRollNo(sivastudent);



    }

}
