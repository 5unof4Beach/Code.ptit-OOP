package tinh_gia_ban;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class TinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name = sc.next();
            long priceTag = sc.nextLong();
            long amount = sc.nextLong();
            Product p = new Product(name, priceTag, amount);
            p.show();
        }
    }
}
