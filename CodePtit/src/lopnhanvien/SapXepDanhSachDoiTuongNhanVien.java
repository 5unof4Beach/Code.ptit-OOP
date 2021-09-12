/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopnhanvien;
import java.text.ParseException;
import java.util.*;
import lopnhanvien.NhanVien;
/**
 *
 * @author suckm
 */
public class SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<NhanVien> res = new Vector<NhanVien>();
        for(int i = 1;i<=n;i++){
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            String taxCode = sc.nextLine();
            String contractDate = sc.nextLine();
            NhanVien nv = new NhanVien(i,name,gender,dob,address,taxCode,contractDate);
            res.add(nv);
        }
        
        Collections.sort(res,new dobCompare());
        for(NhanVien element : res){
            element.show();
        }
        
    }
}

class dobCompare implements Comparator<NhanVien>{
    public int compare(NhanVien n1,NhanVien n2){
        if(n1.getDob().after(n2.getDob())){
            return 1;
        }
        else return -1;
    }
}