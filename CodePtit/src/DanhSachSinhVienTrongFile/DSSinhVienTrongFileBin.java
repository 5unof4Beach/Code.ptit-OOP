package DanhSachSinhVienTrongFile;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
///**
// *
// * @author suckm
// */
//public class DSSinhVienTrongFileBin {
//    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectInputStream din = new ObjectInputStream(new FileInputStream("SV.in"));
//        ArrayList<SinhVien> arr = (ArrayList<SinhVien>) din.readObject();
//        
//        for(SinhVien i:arr){
//            i.show();
//        }
//    }
//}
//
//
//class SinhVien implements Serializable{
//    private Date ngaysinh;
//    private String ma,ten,lop;
//    private float gpa;
//
//    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
//        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
//        this.ma = String.format("B20DCCN%03d", id);
//        this.ten = ten;
//        this.lop = lop;
//        this.gpa = gpa;
//    }
//    
//    public void show(){
//        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.printf("%s %s %s %s %.2f\n",ma,ten,lop,f.format(ngaysinh),gpa);
//    }
//}

import java.text.*;
import java.util.*;
import java.io.*;
public class DSSinhVienTrongFileBin {
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> ds = (ArrayList<SinhVien>) in.readObject();
        for(SinhVien tmp : ds){
            System.out.println(tmp);
        }
    }
}

//class SinhVien implements Serializable{
//    private String ma, ten, lop;
//    private Date ngaysinh;
//    private float gpa;
//
//    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
//        this.ma = "B20DCCN" + String.format("%03d", id);
//        this.ten = ten;
//        this.lop = lop;
//        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + 
//                " " + String.format("%.2f", gpa);
//    }
//    
//    
//}