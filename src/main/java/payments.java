import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class payments {
    @Id
    @GeneratedValue
    private int customerNumber;
    private String checkNumber;
    private LocalDate paymentDate;

    public String getCheckNumber() {
        return checkNumber;
    }

    public payments setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
        return this;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public payments setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public payments setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public payments setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    @Override
    public String toString() {
        return "payments{" +
                "customerNumber=" + customerNumber +
                ", checkNumber='" + checkNumber + '\'' +
                ", paymentDate=" + paymentDate +
                ", amount=" + amount +
                '}';
    }

    private BigDecimal           amount;
}
