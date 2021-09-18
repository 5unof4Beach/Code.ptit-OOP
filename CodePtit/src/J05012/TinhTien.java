package J05012;
import java.util.*;

public class TinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Product> res = new Vector<Product>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            long amount = sc.nextLong();
            long priceTag = sc.nextLong();
            long discount = sc.nextLong();
            sc.nextLine();
            Product pr = new Product(ID,name,amount,priceTag,discount);
            res.add(pr);
        }
        res.sort((i1,i2)->Long.compare(i2.getRealPay(), i1.getRealPay()));
        for(Product i:res){
            i.show();
        }
    }
}
