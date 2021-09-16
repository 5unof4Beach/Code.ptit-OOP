package tiendien;
import java.util.*;
public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Customer> res = new Vector<Customer>();
        for(int i=1 ; i<=n ; i++){
            String type = sc.nextLine();
            long old = Long.parseLong(sc.nextLine());
            long recent = Long.parseLong(sc.nextLine());
//            Customer cus = new Customer();
            Customer cus = new Customer(i,type,old,recent);
            res.add(cus);
        }
        for(Customer i:res){
            i.show();
        }
    }
}
