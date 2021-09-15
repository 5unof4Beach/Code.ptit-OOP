/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopchucvu;
import java.util.*;

public class TinhThuNhapChoNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Employee> res = new Vector<Employee>();
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String pos = sc.nextLine();
            int sal = sc.nextInt();
            int days = sc.nextInt();
            sc.nextLine();
            Employee em = new Employee(i,name,pos,sal,days);
            res.add(em);
        }
        for(Employee i:res){
            i.show();
        }
    }
}
