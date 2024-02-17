package constuctorOverLoading;

public class Test {
    public static void main(String[] args) {
        Address address = new Address();
        address.city = "Hyd";
        address.pincode = "521175";
        address.state = "Ts";
        address.country = "India";
        Student student = new Student("sravs", "srinu", "10/06/2002", "12345", address);
        System.out.println("joining student=" + student);
        Student examStudent = new Student("sravs", "srinu", "10/06/2002", "12345");
        System.out.println("exam student=" + examStudent);


    }
}
