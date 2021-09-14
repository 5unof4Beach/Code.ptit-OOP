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
public class DanhSachDoanhNghiep1 {
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
        for(DoanhNghiep element:res){
            element.show();
        }
    }
}
