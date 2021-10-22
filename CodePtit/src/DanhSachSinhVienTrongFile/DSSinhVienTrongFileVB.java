package DanhSachSinhVienTrongFile;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DSSinhVienTrongFileVB {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        Vector<Student> students = new Vector<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String cl = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Student s = new Student(i, name, cl, dob, gpa);
            s.show();
        }
    }
}


class Student {
    private Date dob;
    private String id,name,cl;
    private float gpa;

    public Student(int i, String name, String cl, String dob, float gpa) throws ParseException {
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.id = String.format("B20DCCN%03d", i);
        this.name = name;
        this.cl = cl;
        this.gpa = gpa;
    }
    
    public void show(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%s %s %s %s %.2f\n",id,name,cl,f.format(dob),gpa);
    }
}
