/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachsinhvien1;

import java.text.*;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> ds = (ArrayList<SinhVien>) in.readObject();
        for(SinhVien tmp : ds){
            System.out.println(tmp);
        }
    }
}
