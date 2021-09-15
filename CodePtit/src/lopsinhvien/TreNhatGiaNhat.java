
package lopsinhvien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        Vector<SinhVien> res = new Vector<SinhVien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String name = sc.next();
            String dob = sc.next();
            SinhVien sv = new SinhVien(name,dob);
            res.add(sv);
        }
        res.sort((i1,i2)->i2.getDob().compareTo(i1.getDob()));
        System.out.println(res.elementAt(0).getName());
        System.out.println(res.elementAt(res.size()-1).getName());
    }
}
