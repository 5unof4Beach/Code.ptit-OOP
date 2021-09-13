/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopsinhvien;
import java.text.ParseException;
import java.util.*;
import java.util.Comparator;

/**
 *
 * @author suckm
 */
public class SapXepSinhVienTheoLop {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<SinhVien> res = new Vector<SinhVien>();
        for(int i = 1;i<=n;i++){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            
            SinhVien SinhVien = new SinhVien(ID,name,lop,email);
            res.add(SinhVien);
        }
        res.sort((i1,i2)->i1.getStrID().compareTo(i2.getStrID()));
        res.sort((i1,i2)->i1.getLop().compareTo(i2.getLop()));
        for(SinhVien element:res){
            element.show();
        }
    }
    
}

