import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class orderdetails {
    @Id
    @GeneratedValue
    private int orderNumber;
    @OneToMany(mappedBy = "productCode")
    private List<products> productCode;
    private int quantityOrdered;

    @Override
    public String toString() {
        return "orderdetails{" +
                "orderNumber=" + orderNumber +
                ", productCode=" + productCode +
                ", quantityOrdered=" + quantityOrdered +
                ", priceEach=" + priceEach +
                ", orderLineNumber=" + orderLineNumber +
                '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public orderdetails setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public List<products> getProductCode() {
        return productCode;
    }

    public orderdetails setProductCode(List<products> productCode) {
        this.productCode = productCode;
        return this;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public orderdetails setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
        return this;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public orderdetails setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
        return this;
    }

    public List<orders> getOrderLineNumber() {
        return orderLineNumber;
    }

    public orderdetails setOrderLineNumber(List<orders> orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
        return this;
    }

    private BigDecimal priceEach;
    @OneToMany(mappedBy = "orderNumber")
    private List<orders> orderLineNumber;


}
