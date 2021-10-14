package diem_danh_J05074;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DiemDanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Vector<Student> students = new Vector<>();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String clss = sc.nextLine();
            Student s = new Student(id, name, clss);
            students.add(s);
        }
        t = students.size();
        while(t-->0){
            String id = sc.next();
            String attendence = sc.next();
            for(Student i:students){
                if(id.equals(i.getId())){
                    i.setAttendence(attendence);
                }
            }
        }
        for(Student i:students){
            i.show();
        }
    }
}
