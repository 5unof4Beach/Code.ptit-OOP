/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopsinhvien;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author suckm
 */
public class LietKeSinhVienTheoKhoa {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        Vector<SinhVien> res = new Vector<SinhVien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(id,name,lop,email);
            res.add(sv);
            
        }


        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String year = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for(SinhVien element:res){
                if( element.getYear().equals(year))
                    element.show();
//                    System.out.println(element.toString());
                    
            }
        }
    }
}
