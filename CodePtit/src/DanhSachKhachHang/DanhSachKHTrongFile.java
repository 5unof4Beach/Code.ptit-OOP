package DanhSachKhachHang;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author suckm
 */
public class DanhSachKHTrongFile {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
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
