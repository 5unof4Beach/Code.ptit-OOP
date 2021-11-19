package dssanpham;

/**
 *
 * @author suckm
 */
public class Product {
    private String id, name;
    private int price, day;

    public Product(String id, String name, int price, int day) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.day = day;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d\n", id, name, price, day);
    }
}
