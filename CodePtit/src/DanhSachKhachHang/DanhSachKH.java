package DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author suckm
 */
public class DanhSachKH {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Vector<Customer> v = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String name = sc.nextLine();
            String gen = sc.nextLine();
            String dob = sc.nextLine();
            String add = sc.nextLine();
            Customer s = new Customer(i, name, gen, dob, add);
            v.add(s);
//            s.show();
        }
        v.sort((i1,i2) -> Long.compare(i1.getAge(), i2.getAge()));
        for(Customer i:v){
            i.show();
        }
    }
}
