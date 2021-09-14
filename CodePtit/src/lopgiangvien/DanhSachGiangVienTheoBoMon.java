package lopgiangvien;
import java.util.*;
/**
 *
 * @author suckm
 */
public class DanhSachGiangVienTheoBoMon {
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
            String temp = sc.nextLine();
            String major = nameFormat(temp);
            System.out.println("DANH SACH GIANG VIEN BO MON " + major + ":");
            for(GiangVien element:res){
                if( element.getSubject().contains(major))
                    element.show();
            }
        }
        
    }
    
    public static String nameFormat(String str){
        String temp[] = str.split(" ");
        String res = "";
        for(int i=0;i<temp.length;i++){
            res += temp[i].charAt(0);
        }
        return res.toUpperCase();
    }
}
