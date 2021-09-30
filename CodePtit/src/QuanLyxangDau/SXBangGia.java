package QuanLyxangDau;

import java.util.*;

public class SXBangGia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Product> res = new Vector<Product>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.next();
            long amount = sc.nextLong();
            sc.nextLine();
            Product pd = new Product(id, amount);
            res.add(pd);
        }
        res.sort((i1,i2) -> Long.compare(i2.getTotal(), i1.getTotal()));
        for(Product i:res){
            i.show();
        }
    }
}
