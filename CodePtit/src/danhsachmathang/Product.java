package danhsachmathang;

/**
 *
 * @author suckm
 */
public class Product {
    private String name, unit, id;
    private long buyPrice, sellPrice, profit;

    public Product(int i, String name, String unit, long buyPrice, long sellPrice) {
        id = String.format("MH%02d",i);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        setProfit();
    }

    public void setProfit() {
        this.profit = sellPrice - buyPrice;
    }

    public long getProfit() {
        return profit;
    }

    public String getId() {
        return id;
    }
    
    public void show(){
        System.out.printf("%s %s %s %d %d %d\n",id, name, unit, buyPrice, sellPrice, profit);
    }
}
