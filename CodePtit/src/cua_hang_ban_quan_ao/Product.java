package cua_hang_ban_quan_ao;

import java.util.Vector;

/**
 *
 * @author suckm
 */
public class Product {
    private String id,name;
    private Vector<Long> price = new Vector<Long>();

    public Product(String id, String name, long type1, long type2) {
        this.id = id;
        this.name = name;
        price.add(type1);
        price.add(type2);
    }

    public Vector<Long> getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
}
