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
public class LietKeSinhVientheoLop {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        List<SV> res = new ArrayList<SV>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SV sv = new SV(id,name,lop,email);
            res.add(sv);
            
        }
//        for(SV element:res){
//            System.out.println(element.getCl());
//        }

        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String cl = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + cl + ":");
            for(SV element:res){
                if( element.getCl().equals(cl.trim()))
//                    element.show();
                    System.out.println(element.toString());
            }
        }
    }
}
