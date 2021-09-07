/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PS;
import java.util.*;
import PS.PhanSo;
/**
 *
 * @author suckm
 */
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo ps2 = new PhanSo(sc.nextLong(),sc.nextLong());
        long res_tu = ps1.tu * ps2.mau + ps2.tu * ps1.mau;
        long res_mau = ps1.mau * ps2.mau;
        PhanSo res = new PhanSo(res_tu,res_mau);
        res.rutGon();
    }
}
