package DSMonHoc;

import java.io.File;
import java.io.*;
import java.util.*;

/**
 *
 * @author suckm
 */
public class BangDiemTheoMonHoc {
    static Vector<Student> students = new Vector<>();
    static Vector<Subject> subjects = new Vector<>();
    static Vector<PointTable> pointTables = new Vector<>();
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String email = sc.nextLine();
            Student s = new Student(id, name, cl, email);
            students.add(s);
        }
        
        f = new File("MONHOC.in");
        sc = new Scanner(f);
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            Subject s = new Subject(id, name, stc);
            subjects.add(s);
        }
        
        f = new File("BANGDIEM.in");
        sc = new Scanner(f);
        n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] s =sc.nextLine().split(" ");
            PointTable pt = new PointTable(getStu(s[0].trim()), getSub(s[1]), Double.parseDouble(s[2]));
            pointTables.add(pt);
        }
        
        n = Integer.parseInt(sc.nextLine());
        pointTables.sort((i1, i2) -> i1.getStuID().compareTo(i2.getStuID()));
        pointTables.sort((i1, i2) -> Double.compare(i2.getpoint(), i1.getpoint()));
        
        for(int i = 1; i <= n; i++){
            String s  = sc.nextLine();
            System.out.print("BANG DIEM MON ");
            for(Subject j: subjects){
                if(s.equals(j.getId())){
                    System.out.println(j.getName()+ ":");
                    break;
                }
            }
            for(PointTable j: pointTables){
                if(j.getSubID().equals(s)){
                    System.out.println(j);
                }
            }
            
        }
    }
    
    public static Student getStu(String stuName){
        for(Student i: students){
            if(i.getid().equals(stuName)){
                return i;
            }
        }
        return null;
    }
    
    public static Subject getSub(String SubID){
        for(Subject i: subjects){
            if(i.getId().equals(SubID)){
                return i;
            }
        }
        return null;
    }
}
