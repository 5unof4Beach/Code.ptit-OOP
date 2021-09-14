/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopsinhvien;
import java.text.ParseException;
import java.util.*;

public class SapXepTheoMaSV {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Vector<SinhVien> res = new Vector<SinhVien>();

        while(sc.hasNextLine()){
            String ID = sc.nextLine();
//            if(ID.equals("")) break;
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(ID,name,lop,email);
            res.add(sv);  
//            System.out.println(sv.getName());
//            sv.show();
        }
        
        res.sort((i1,i2) -> i1.getStrID().compareTo(i2.getStrID()));
        for(SinhVien element:res){
            element.show();
        }
        sc.close();
    }
    
}

