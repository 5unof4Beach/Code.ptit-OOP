/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopsinhvien;
import java.text.ParseException;
import java.util.*;
import lopsinhvien.SinhVien;
/**
 *
 * @author suckm
 */
public class DanhSachDoiTuongSV2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<SinhVien> res = new Vector<SinhVien>();
        for(int i = 1;i<=n;i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            SinhVien sv = new SinhVien(i,name,lop,dob,gpa);
            res.add(sv);
        }
        for(SinhVien element:res){
            System.out.println(element.toString());
        }
    }
}
