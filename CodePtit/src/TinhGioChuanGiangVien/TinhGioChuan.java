package TinhGioChuanGiangVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class TinhGioChuan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Vector<Subject> subjects = new Vector<>();
        Vector<Lecturer> lecturers = new Vector<>();
        Vector<Table> tables = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String arr[] = sc.nextLine().split(" ",2);
            Subject s = new Subject(arr[0], arr[1]);
            subjects.add(s);
        }
        
        sc = new Scanner(new File("GIANGVIEN.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String arr[] = sc.nextLine().split(" ",2);
            Lecturer l = new Lecturer(arr[0], arr[1]);
            lecturers.add(l);
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String arr[] = sc.nextLine().split(" ");
            Table ta = new Table(arr[0], arr[1], Float.parseFloat(arr[2]));
            tables.add(ta);
            
            for(Lecturer i:lecturers){
                if(ta.getLecturerID().equals(i.getId())){
                    i.addTime(ta.getHours());
                }
            }
        }
        for(Lecturer i:lecturers){
            i.show();
        }
    }
}
