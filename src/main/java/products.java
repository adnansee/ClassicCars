import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class products {
    @Id
    @GeneratedValue
    private String productCode;

    public String getProductCode() {
        return productCode;
    }

    public products setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public products setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public List<productlines> getProductLine() {
        return productLine;
    }

    public products setProductLine(List<productlines> productLine) {
        this.productLine = productLine;
        return this;
    }

    public String getProductScale() {
        return productScale;
    }

    public products setProductScale(String productScale) {
        this.productScale = productScale;
        return this;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public products setProductVendor(String productVendor) {
        this.productVendor = productVendor;
        return this;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public products setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public products setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
        return this;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public products setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public BigDecimal getMSRP() {
        return MSRP;
    }

    public products setMSRP(BigDecimal MSRP) {
        this.MSRP = MSRP;
        return this;
    }

    @Override
    public String toString() {
        return "products{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productLine=" + productLine +
                ", productScale='" + productScale + '\'' +
                ", productVendor='" + productVendor + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", buyPrice=" + buyPrice +
                ", MSRP=" + MSRP +
                '}';
    }

    private String productName;
    @OneToMany (mappedBy = "productLine")
    private List<productlines> productLine;
    private String productScale;

    private String productVendor;
    @Column(columnDefinition = "TEXT")
    private String productDescription;
    @Column(columnDefinition = "SMALLINT")
    private int quantityInStock;
    private BigDecimal buyPrice;
    private BigDecimal MSRP;

}
