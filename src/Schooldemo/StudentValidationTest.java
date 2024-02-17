package Schooldemo;

import javax.swing.text.html.FormSubmitEvent;

public class StudentValidationTest {
    public boolean ispassed(Subject subject) {
        System.out.println("from ispassed" + subject.subject);
        return subject.marks >= 35;
    }

    Student getresult(Student inputstudent) {
        if (ispassed(inputstudent.marks.telugu)) {
            inputstudent.marks.telugu.result = "pass";
        } else {
            inputstudent.marks.telugu.result = "fail";
        }
        if (ispassed(inputstudent.marks.english)) {
            inputstudent.marks.english.result = "pass";
        } else {
            inputstudent.marks.english.result = "fail";
        }
        if (ispassed(inputstudent.marks.science)) {
            inputstudent.marks.science.result = "pass";
        } else {
            inputstudent.marks.science.result = "fail";
        }
        if (ispassed(inputstudent.marks.social)) {
            inputstudent.marks.social.result = "pass";
        } else {
            inputstudent.marks.social.result = "fail";
        }
        if (ispassed(inputstudent.marks.maths)) {
            inputstudent.marks.maths.result = "pass";
        } else {
            inputstudent.marks.maths.result = "fail";
        }
        if (ispassed(inputstudent.marks.hindi)) {
            inputstudent.marks.hindi.result = "pass";
        } else {
            inputstudent.marks.hindi.result = "fail";
        }
        if (inputstudent.marks.telugu.result.equals("pass")&&
        inputstudent.marks.hindi.result.equals("pass")&&
        inputstudent.marks.english.result.equals("pass")&&
        inputstudent.marks.science.result.equals("pass")&&
        inputstudent.marks.social.result.equals("pass")&&
        inputstudent.marks.maths.result.equals("pass"))
        {
            inputstudent.result="Pass";
        }
        else{
            inputstudent.result = "fail";
        }
        return inputstudent;
    }

    public static void main(String[] args){
        Subject telugusubject=new Subject();
        telugusubject.marks=80;
        telugusubject.subject="Telugu";

        Subject englishsubject=new Subject();

        englishsubject.marks=92;
        englishsubject.subject="English";

        Subject mathssubject=new Subject();
        mathssubject.marks=83;
        mathssubject.subject="Maths";

        Subject socialsubject=new Subject();
        socialsubject.marks=95;
        socialsubject.subject="Social";

        Subject sciencesubject=new Subject();
        sciencesubject.marks=88;
        sciencesubject.subject="Science";

        Subject hindisubject=new Subject();
        hindisubject.marks=91;
        hindisubject.subject="Hindi";

        Marks marks=new Marks();
        marks.telugu=telugusubject;
        marks.english=englishsubject;
        marks.maths=mathssubject;
        marks.social=socialsubject;
        marks.science=sciencesubject;
        marks.hindi=hindisubject;

        Student student=new Student();
        student.marks= marks;
        student.name="ashri";
        student.fatherName="surya";
        student.mobileNumber="7989363569";
        student.dateOfBirth="10112002";

        StudentValidationTest validationTest=new StudentValidationTest();
        Student lateststudent=validationTest.getresult(student);
        System.out.println(lateststudent);

    }
}
