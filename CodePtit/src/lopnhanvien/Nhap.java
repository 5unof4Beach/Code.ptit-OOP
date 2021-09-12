/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopnhanvien;
import java.util.*;
import lopnhanvien.NhanVien;
/**
 *
 * @author suckm
 */
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.setName(sc.nextLine());
        nv.setGender(sc.nextLine());
        nv.setDob(sc.nextLine());
        nv.setAddr(sc.nextLine());
        nv.setTaxcode(sc.nextLine());
        nv.setContract_date(sc.next());
        nv.setStt(1);
        
        System.out.print(nv.getStt() + " " );
        System.out.print(nv.getName() + " " );
        System.out.print(nv.getGender()+ " " );
        System.out.print(nv.getDob()+ " " );
        System.out.print(nv.getAddr()+ " " );
        System.out.print(nv.getTaxcode()+ " " );
        System.out.print(nv.getContract_date()+ " " );
    }
}
