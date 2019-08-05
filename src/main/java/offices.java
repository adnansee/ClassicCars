import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class offices {
    @Id
    @GeneratedValue
    private String officeCode;
    private String city;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String state;

    @Override
    public String toString() {
        return "offices{" +
                "officeCode='" + officeCode + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", territory='" + territory + '\'' +
                '}';
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public offices setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public offices setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public offices setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public offices setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public offices setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public String getState() {
        return state;
    }

    public offices setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public offices setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public offices setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getTerritory() {
        return territory;
    }

    public offices setTerritory(String territory) {
        this.territory = territory;
        return this;
    }

    private String country;
    private String postalCode;
    private String territory;

}
