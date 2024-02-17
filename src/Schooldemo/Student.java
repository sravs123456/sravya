package Schooldemo;

public class Student {
    public String name;
    public String fatherName;
    public String mobileNumber;

    public String dateOfBirth;
    public String schoolName;
    public Address address;
   public Marks marks;
   public String result;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", address=" + address +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
