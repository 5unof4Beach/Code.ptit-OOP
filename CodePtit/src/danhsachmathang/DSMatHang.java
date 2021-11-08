package danhsachmathang;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DSMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Product> products = new Vector<>();
        int t  = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            long b = Long.parseLong(sc.nextLine());
            long s = Long.parseLong(sc.nextLine());
            Product p = new Product(i, name, unit, b, s);
            products.add(p);
        }
        products.sort((i1,i2) -> i1.getId().compareTo(i2.getId()));
        products.sort((i1,i2) -> Long.compare(i2.getProfit(), i1.getProfit()));
        
        for(Product i:products){
            i.show();
        }
    }
}
