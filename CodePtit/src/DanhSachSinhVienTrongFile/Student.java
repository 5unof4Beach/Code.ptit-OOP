package DanhSachSinhVienTrongFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class Student {
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
