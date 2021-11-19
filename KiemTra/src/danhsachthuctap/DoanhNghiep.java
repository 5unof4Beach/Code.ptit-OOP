package danhsachthuctap;

import doanhnghiep.*;
import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DoanhNghiep {
    private String id, name;
    private int student;
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
        students.add(s);
    }
     public void sortAndShow(){
        students.sort((i1,i2) -> i1.getId().compareTo(i2.getId()));
        for(Student i:students){
            i.show();
        }
    }
}
