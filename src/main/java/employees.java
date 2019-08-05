import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class employees {
    @Id
    @GeneratedValue
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    @OneToMany(mappedBy = "officeCode")
    private List<offices> officeCode;
    private int reportsTo;
    private String jobTitle;


    public employees() {
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public employees setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public employees setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public employees setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getExtension() {
        return extension;
    }

    public employees setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        return "employees{" +
                "employeeNumber=" + employeeNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", extension='" + extension + '\'' +
                ", email='" + email + '\'' +
                ", officeCode=" + officeCode +
                ", reportsTo=" + reportsTo +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public employees setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<offices> getOfficeCode() {
        return officeCode;
    }

    public employees setOfficeCode(List<offices> officeCode) {
        this.officeCode = officeCode;
        return this;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public employees setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public employees setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
}
