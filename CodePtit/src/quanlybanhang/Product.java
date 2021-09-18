package quanlybanhang;

/**
 *
 * @author suckm
 */
public class Product {
    private String ID,name,unit;
    private long importPrice,sellPrice;

    public Product(int id, String name, String unit, long importPrice, long sellPrice) {
        if(id<10) ID = "MH00" + id;
        else ID = "MH0" + id;
        this.name = name;
        this.unit = unit;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public long getImportPrice() {
        return importPrice;
    }

    public long getSellPrice() {
        return sellPrice;
    }

    
}
