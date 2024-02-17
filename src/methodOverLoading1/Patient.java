package methodOverLoading1;

public class Patient {
    private String patientName;
    private int age;
    private String mobileNum;
    private String patientDisease;

    public Patient(String patientName, int age, String mobileNum) {
        this.patientName = patientName;
        this.age = age;
        this.mobileNum = mobileNum;
        // this.patientDisease=patientDisease;

    }

    public Patient(String patientName, int age, String mobileNum, String patientDisease) {
        this(patientName, age, mobileNum);
        this.patientDisease = patientDisease;
    }

        public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getMobileNum() {
        return mobileNum;
    }
    public
}




