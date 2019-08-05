import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class customers {
    @Id
    @GeneratedValue
    private int customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    @OneToMany(mappedBy = "employeeNumber")
    private List<employees> salesRepEmplyeeNumber;
    private BigDecimal creditLimit;

    public int getCustomerNumber() {
        return customerNumber;
    }

    public customers setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public customers setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public customers setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
        return this;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public customers setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public customers setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public customers setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public customers setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public String getCity() {
        return city;
    }

    public customers setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public customers setState(String state) {
        this.state = state;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public customers setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public customers setCountry(String country) {
        this.country = country;
        return this;
    }

    public List<employees> getSalesRepEmplyeeNumber() {
        return salesRepEmplyeeNumber;
    }

    public customers setSalesRepEmplyeeNumber(List<employees> salesRepEmplyeeNumber) {
        this.salesRepEmplyeeNumber = salesRepEmplyeeNumber;
        return this;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public customers setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }

    @Override
    public String toString() {
        return "customers{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", contactLastName='" + contactLastName + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", salesRepEmplyeeNumber=" + salesRepEmplyeeNumber +
                ", creditLimit=" + creditLimit +
                '}';
    }

    public customers() {
    }
}
