
package mainproject;

public class Address {
    private String city;
    private String streetName;
    
    public Address(String city,String streetName){
        this.city=city;
        this.streetName=streetName;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return " Address{" + "City=" + getCity() + ", streetName=" + getStreetName() + "}}";
    }
}
