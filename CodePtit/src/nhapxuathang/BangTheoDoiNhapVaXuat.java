package nhapxuathang;
import java.util.*;
/**
 *
 * @author suckm
 */
public class BangTheoDoiNhapVaXuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Product> res = new Vector<Product>();
        for(int i=0;i<n;i++){
            String code = sc.nextLine();
            long importAmount = sc.nextLong();
            sc.nextLine();
            Product pr = new Product(code,importAmount);
            res.add(pr);
        }
        String q = sc.nextLine();
        res.sort((i1,i2)->Long.compare(i2.getTaxMoney(), i1.getTaxMoney()));
        for(Product i:res){
            if(i.getGroup().equals(q))
                i.show();
        }
    }
}
