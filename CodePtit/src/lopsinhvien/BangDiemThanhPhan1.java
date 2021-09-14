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
public class BangDiemThanhPhan1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        Vector<SinhVien> res = new Vector<SinhVien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            float m1 = Float.parseFloat(sc.nextLine());
            float m2 = Float.parseFloat(sc.nextLine());
            float m3 = Float.parseFloat(sc.nextLine());
            SinhVien sv = new SinhVien(id,name,lop,m1,m2,m3);
            res.add(sv);
            
        }
        res.sort((i1,i2)->i1.getName().compareTo(i2.getName()));
        int count = 1;
        for(SinhVien element:res){
            System.out.print(count + " ");count++;
            element.showInfoAndMarks();
        }

    }
}
