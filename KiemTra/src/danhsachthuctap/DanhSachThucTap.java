package danhsachthuctap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DanhSachThucTap {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        TreeMap<String, Student> students = new TreeMap<>();
        Vector<DoanhNghiep> doanhNghiep = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String email = sc.nextLine();
            Student s = new Student(id, name, cl, email);
            students.put(id, s);
        }
        sc = new Scanner(new File("DN.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int student = Integer.parseInt(sc.nextLine());
            DoanhNghiep d = new DoanhNghiep(id, name, student);
            doanhNghiep.add(d);
        }
        
        sc = new Scanner(new File("THUCTAP.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String temp[] = sc.nextLine().split(" ");
            for(DoanhNghiep i:doanhNghiep){
                if(i.getId().equals(temp[1])){
                    i.addStudent(students.get(temp[0]));
                    break;
                }
            }
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String DNid = sc.nextLine();
            for(DoanhNghiep i:doanhNghiep){
                if(i.getId().equals(DNid)){
                    System.out.printf("DANH SACH THUC TAP TAI %s:\n", i.getName());
                    i.sortAndShow();
                }
            }
        }
    }
}


class Student {
    private String id, name, cl, email;

    public Student(String id, String name, String cl, String email) {
        this.id = id;
        this.name = Standardize(name);
        this.cl = cl;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    
    
    
    public String Standardize(String str){
        String name[] = str.trim().toLowerCase().split("\\s+");
        String res  = "";
        
        for(String i:name){
            String temp = i.substring(0,1).toUpperCase() + i.substring(1) + " ";
            res += temp;
        }
        return res.trim();
    }
    
    public void show(){
        System.out.printf("%s %s %s\n", id, name, cl);
    }
    
   
}


class DoanhNghiep {
    private String id, name;
    private int student, count;
    private Vector<Student> students = new Vector<>();

    public DoanhNghiep(String id, String name, int student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public String getId() {
        return id;
    }
    public void show(){
        System.out.printf("%s %s %d\n", id, name, student);
    }

    public String getName() {
        return name;
    }
    
    public void addStudent(Student s){
            count++;
            students.add(s);
    }
     public void sortAndShow(){
        int c = 0;
        students.sort((i1,i2) -> i1.getId().compareTo(i2.getId()));
        for(Student i:students){
            if(c<student){
                i.show();
                c++;
            }
        }
    }
}
