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
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        sv.setStuID("B20DCCN001");
        sv.setName(sc.nextLine());
        sv.setLop(sc.nextLine());
        sv.setDob(sc.next());
        sv.setGpa(sc.nextFloat());
        sv.printstuID();
        sv.printName();
        sv.printLop();
        sv.printDOB();
        sv.printGPA();
    }
}
