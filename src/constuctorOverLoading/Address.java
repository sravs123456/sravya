package constuctorOverLoading;

public class Address {
    public String city;
    public String state;
    public String country;
    public String pincode;
    public Address(){
        city="hyd";
        state="Ts";
        country="India";
        pincode="521175";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

