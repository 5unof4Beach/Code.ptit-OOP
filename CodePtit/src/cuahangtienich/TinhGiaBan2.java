package cuahangtienich;
import java.util.*;
public class TinhGiaBan2 {
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
        res.sort((i1,i2)->Long.compare(i2.getRetailPrice(), i1.getRetailPrice()));
        for(Product i:res){
            i.show2();
        }
    }
}
