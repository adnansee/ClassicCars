import javax.persistence.*;
import java.util.Arrays;

@Entity
public class productlines {
    @Id
    @GeneratedValue
    private String productLine;
    private String textDescription;
    @Column(columnDefinition = "MEDIUMTEXT")
    private byte[] htmlDescription;

    public String getProductLine() {
        return productLine;
    }

    public productlines setProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public productlines setTextDescription(String textDescription) {
        this.textDescription = textDescription;
        return this;
    }

    public byte[] getHtmlDescription() {
        return htmlDescription;
    }

    public productlines setHtmlDescription(byte[] htmlDescription) {
        this.htmlDescription = htmlDescription;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public productlines setImage(byte[] image) {
        this.image = image;
        return this;
    }

    @Column
            (columnDefinition = "MEDIUMBLOB")
    private byte[] image;


    @Override
    public String toString() {
        return "productlines{" +
                "productLine='" + productLine + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", htmlDescription=" + Arrays.toString(htmlDescription) +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
