package cua_hang_ban_quan_ao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class HoaDon1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        Vector<Product> products = new Vector<Product>();
        Vector<Bill> bills = new Vector<Bill>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            long type1 = sc.nextLong();
            long type2 = sc.nextLong();
            sc.nextLine();
            Product pd = new Product(id, name, type1, type2);
            products.add(pd);
        }
        
        sc = new Scanner(new File("DATA2.in"));
        t = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String id = sc.next();
            long amount = sc.nextInt();
            sc.nextLine();
            Bill bi = new Bill(id, i, amount);
            for(Product j:products){
                if(j.getId().equals(bi.getProductId())){
                    bi.setProduct(j);
                    bills.add(bi);
//                    break;
                }
            }
        }
        for(Bill i:bills){
            i.setProductPrice();
            i.setDiscount();
            i.setTotalPay();
            i.show();
        }
//        bills.sort((i1,i2)->Long.compare(i2.getTotalPay(), i1.getTotalPay()));
//        for(Bill i:bills){
//            i.show();
//        }
    }
}
