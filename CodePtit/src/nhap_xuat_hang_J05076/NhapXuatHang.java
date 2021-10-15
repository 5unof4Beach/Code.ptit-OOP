package nhap_xuat_hang_J05076;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Vector<Product> products = new Vector<>();
        Vector<Stat> stats = new Vector<>();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            Product p = new Product(id, name, type);
            products.add(p);
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.next();
            long importPrice = Long.parseLong(sc.next());
            long exportPrice = Long.parseLong(sc.next());
            long priceTag = Long.parseLong(sc.next());
            Stat s = new Stat(id, importPrice, priceTag, exportPrice);
            stats.add(s);
        }
        for(Stat i:stats){
            for(Product j:products){
                if(i.getId().equals(j.getId())){
                    i.setName(j.getName());
                    i.setType(j.getType());
                }
            }
        }
        for(Stat i:stats){
            i.show();
        }
    }
}
