package tinh_luong_nhan_vien;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class BangLuongTheoPhongBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Office> offices = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
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
        String name = sc.nextLine();
        
        for(Office i:offices){
            if(i.getId().equals(name)){
                System.out.printf("Bang luong phong %s:\n",i.getName());
                break;
            }
        }
        
        for(Employee j:employees){
            if(j.getOfficeID().equals(name))
                j.show2();
        }
    }
}
