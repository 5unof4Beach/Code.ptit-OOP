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
public class Nhap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Vector<SinhVien> res = new Vector<SinhVien>();
        
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String dob = sc.nextLine();
        float gpa = Float.parseFloat(sc.nextLine());
        SinhVien sv = new SinhVien(1,name,lop,dob,gpa);
        res.add(sv);
        
        for(SinhVien element:res){
            System.out.println(element.toString());
        }
    }
}
