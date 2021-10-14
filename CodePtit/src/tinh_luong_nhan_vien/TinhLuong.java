package tinh_luong_nhan_vien;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Office> offices = new Vector<>();
        Vector<Employee> employees = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String fullID = sc.nextLine();
            Office o = new Office(fullID);
            offices.add(o);
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int sal = sc.nextInt();
            int days = sc.nextInt();
            sc.nextLine();
            Employee e = new Employee(id, name, sal, days);
            employees.add(e);
        }
        for(Office i:offices){
            for(Employee j:employees){
                if(i.getId().equals(j.getOfficeID())){
                    j.setOfficeName(i.getName());
                }
            }
        }
        for(Employee j:employees){
            j.show();
        }
    }
}
