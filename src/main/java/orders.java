import javax.persistence.*;


import java.sql.Date;
import java.util.List;

@Entity
public class orders {
    @Id
    @GeneratedValue
    private int orderNumber;
    private java.sql.Date orderDate;
    private java.sql.Date requiredDate;
    private java.sql.Date shippedDate;
    private String status;
@Column(columnDefinition = "TEXT")
    private String comments;
    @OneToMany(mappedBy = "customerNumber")
    private List<customers> customerNumber;

    @Override
    public String toString() {
        return "orders{" +
                "orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                ", requiredDate=" + requiredDate +
                ", shippedDate=" + shippedDate +
                ", status='" + status + '\'' +
                ", comments='" + comments + '\'' +
                ", customerNumber=" + customerNumber +
                '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public orders setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public orders setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public orders setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
        return this;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public orders setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public orders setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public orders setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public List<customers> getCustomerNumber() {
        return customerNumber;
    }

    public orders setCustomerNumber(List<customers> customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
}
