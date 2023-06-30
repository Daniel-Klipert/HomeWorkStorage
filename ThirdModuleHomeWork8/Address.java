package ThirdModuleHomeWork8;

public class Address {

    private String city;
    private String region;

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public Address(String city, String region) {
        this.city = city;
        this.region = region;
    }
}
