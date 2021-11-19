package dssanpham;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DSSanPham {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        Vector<Product> pr = new Vector<>();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            Product p = new Product(id, name, price, days);
            pr.add(p);
        }
        pr.sort((i1,i2)->i1.getId().compareTo(i2.getId()));
        pr.sort((i1,i2)->Integer.compare(i2.getPrice(), i1.getPrice()));
        
        for(Product i:pr){
            i.show();
        }
    }
}


class Product {
    private String id, name;
    private int price, day;

    public Product(String id, String name, int price, int day) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d\n", id, name, price, day);
    }
}

class Customer{
    private String name, add;
    private long amount, pay;
    private Date buyDate;
    private Product p;

    public Customer(String name, String add, long amount, String buyDate) throws ParseException {
        this.name = name;
        this.add = add;
        this.amount = amount;
        this.buyDate = new SimpleDateFormat("dd/MM/yyyy").parse(buyDate);
    }

    public void setP(Product p) {
        this.p = p;
    }
    
}
