package TinhGioChuanGiangVien;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class TinhGioChuanChoTungGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Subject> subjects = new Vector<>();
        Vector<Lecturer> lecturers = new Vector<>();
        Vector<Table> tables = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String arr[] = sc.nextLine().split(" ",2);
            Subject s = new Subject(arr[0], arr[1]);
            subjects.add(s);
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String arr[] = sc.nextLine().split(" ",2);
            Lecturer l = new Lecturer(arr[0], arr[1]);
            lecturers.add(l);
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String arr[] = sc.nextLine().split(" ");
            Table ta = new Table(arr[0], arr[1], Float.parseFloat(arr[2]));
            tables.add(ta);
            
            for(Lecturer i:lecturers){
                if(ta.getLecturerID().equals(i.getId())){
                    i.addTime(ta.getHours());
                    ta.setLecturer(i);
                }
            }
            
            for(Subject j:subjects){
                if(ta.getSubjectID().equals(j.getId())){
                    ta.setSubject(j);
                }
            }
        }
        String id = sc.nextLine();
        Lecturer tmp = new Lecturer("", "");
        for(Table i:tables){
            if(i.getLecturerID().equals(id)){
                System.out.printf("Giang vien: %s\n",i.getLecturer().getName());
                tmp = i.getLecturer();
                break;
            }
        }
        for(Table i:tables){
            if(i.getLecturerID().equals(id)){
                i.getSubject().show();
                System.out.println(" " + i.getHours());
            }
        }
        tmp.showTotalTime();
    }
}
