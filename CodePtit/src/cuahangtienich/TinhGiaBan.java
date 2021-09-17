package cuahangtienich;
import java.util.*;
public class TinhGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Product> res = new Vector<Product>();
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            long priceTag = sc.nextInt();
            long amount = sc.nextInt();
            sc.nextLine();
            Product pr = new Product(i,name,unit,priceTag,amount);
            res.add(pr);
        }
        for(Product i:res){
            i.show();
        }
    }
}
