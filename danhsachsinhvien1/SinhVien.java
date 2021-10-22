/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachsinhvien1;

import java.text.*;
import java.util.*;
import java.io.*;
public class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + 
                " " + String.format("%.2f", gpa);
    }
    
    
}
