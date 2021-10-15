package nhap_xuat_hang_J05076;

/**
 *
 * @author suckm
 */
public class Product {
    private String id, name, type;
    private long importAmount,exportAmount,pricetag,imPrice,exPrice;
    private double tax;

    public Product(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
