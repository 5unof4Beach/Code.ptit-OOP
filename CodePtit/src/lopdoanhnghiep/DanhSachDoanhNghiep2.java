/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopdoanhnghiep;
import java.util.*;
/**
 *
 * @author suckm
 */
public class DanhSachDoanhNghiep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<DoanhNghiep> res = new Vector<DoanhNghiep>(); 
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int amount  = Integer.parseInt(sc.nextLine());
            DoanhNghiep dn = new DoanhNghiep(code,name,amount);
            res.add(dn);
        }
        res.sort((i1,i2)->i1.getCodeName().compareTo(i2.getCodeName()));
        res.sort((i1,i2)->Integer.compare(i2.getAmount(), i1.getAmount()));
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            int begin = Integer.parseInt(sc.next());
            int end = Integer.parseInt(sc.next());
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",begin,end);
            for(DoanhNghiep element:res){
                if(begin <= element.getAmount() && element.getAmount()<=end)
                    element.show();
            }
        }
    }
}
