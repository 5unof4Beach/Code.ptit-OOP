/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopnhanvien;
import java.text.ParseException;
import java.util.*;
import lopnhanvien.NhanVien;
/**
 *
 * @author suckm
 */
public class Nhap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            String taxCode = sc.nextLine();
            String contractDate = sc.nextLine();
            NhanVien nv = new NhanVien(1,name,gender,dob,address,taxCode,contractDate);
            nv.show();
    }
}
