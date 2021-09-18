package quanlytiennuoc;
import java.util.*;

public class HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<WaterCustomer> res = new Vector<WaterCustomer>();
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            long oldIndex = sc.nextLong();
            long currentIndex = sc.nextLong();
            sc.nextLine();
            WaterCustomer wa = new WaterCustomer(i, name, oldIndex, currentIndex);
            res.add(wa);
        }
        res.sort((i1,i2)->Long.compare(i2.getTotal(), i1.getTotal()));
        for(WaterCustomer i:res){
            i.show();
        }
    }
}
