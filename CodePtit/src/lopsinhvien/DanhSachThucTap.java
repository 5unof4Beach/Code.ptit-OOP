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
public class DanhSachThucTap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<SinhVien> res = new Vector<SinhVien>();
        for(int i = 1;i<=n;i++){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String company = sc.nextLine();
            
            SinhVien sv = new SinhVien(i,ID,name,lop,email,company);
            res.add(sv);
        }
        
        res.sort((i1,i2)->i1.getName().compareTo(i2.getName()));
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String companyName = sc.nextLine();
            for(SinhVien element:res){
                if(element.getCompany().equals(companyName))
                element.showInfoAndCompany();
            }
            
        }
    }
    
}

