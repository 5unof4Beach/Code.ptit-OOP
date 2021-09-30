package QuanLyxangDau;

import java.util.*;

public class QuanLyKhoXangDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.next();
            long amount = sc.nextLong();
            sc.nextLine();
            Product pd = new Product(id, amount);
            pd.show();
        }
    }
}
