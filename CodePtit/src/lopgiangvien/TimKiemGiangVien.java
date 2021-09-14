package lopgiangvien;
import java.util.*;
/**
 *
 * @author suckm
 */
public class TimKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<GiangVien> res = new Vector<GiangVien>();
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String subject = sc.nextLine();
            GiangVien gv = new GiangVien(i,name,subject);
            res.add(gv);
        }

        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String key = sc.nextLine();

            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
            for(GiangVien element:res){
                if( element.getFullName().toLowerCase().contains(key.toLowerCase()))
                    element.show();
            }
        }
        
    }
}
