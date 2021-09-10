/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopsinhvien;
import java.util.*;
import lopsinhvien.SinhVien;
/**
 *
 * @author suckm
 */
public class DanhSachDoiTuongSV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien sv = new SinhVien();
//        sc.close();
        int c = 1;
        while(n-->0){
            sc.reset();
            sv.setStuID(c);
            sv.setName(sc.nextLine());
            sv.setLop(sc.next());
            sv.setDob(sc.next());
            sv.setGpa(sc.nextFloat());
            sv.printstuID();
            sv.printName();
            sv.printLop();
            sv.printDOB();
            sv.printGPA();
            System.out.println("");
            sc.nextLine();
            c++;
            
        }
    }
}
