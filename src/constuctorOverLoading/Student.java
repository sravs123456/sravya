package constuctorOverLoading;

public class Student {
    public String name;
    public String fatherName;
    public String dateOfBirth;
    public String mobileNum;
    public Address address;

    public Student(String name, String fatherName, String dateOfBirth, String mobileNum, Address address) {
        this.name = name;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.mobileNum = mobileNum;
        this.address = address;
    }
    public Student(String name,String fatherName,String dateOfBirth,String mobileNum){
        this(name, fatherName,dateOfBirth,mobileNum,new Address());

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", address=" + address +
                '}';
    }
}





