package DanhSachSinhVienTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author suckm
 */
public class ChuanHoaDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String name = sc.nextLine();
            String id = sc.nextLine();
            String dob = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Student s = new Student(i, name, id, dob, gpa);
            s.show();
        }
    }
}
