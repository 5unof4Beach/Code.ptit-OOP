package lopgiangvien;
import java.util.*;
/**
 *
 * @author suckm
 */
public class SapXepDanhSachGiangVien {
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
        res.sort((i1,i2)->i1.getID().compareTo(i2.getID()));
        res.sort((i1,i2)->i1.getFirstName().compareTo(i2.getFirstName()));
        for(GiangVien element:res){
            element.show();
        }
    }
}
