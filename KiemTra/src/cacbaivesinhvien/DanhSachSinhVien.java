package cacbaivesinhvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        Vector<Student> students = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String email = sc.nextLine();
            Student s = new Student(id, name, cl, email);
            students.add(s);
        }
        
        students.sort((i1,i2) -> i1.getId().compareTo(i2.getId()));
        
        for(Student i:students){
            i.show();
        }
    }
}
