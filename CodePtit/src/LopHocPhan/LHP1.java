package LopHocPhan;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class LHP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Department> deps = new Vector<>();
        HashMap<String, String> names = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String group = sc.nextLine();
            String tutor = sc.nextLine();
            Department d = new Department(id, name, group, tutor);
            deps.add(d);
            
            if(!name.contains(id)){
                names.put(id, name);
            }
        }
        deps.sort((i1,i2)->i1.getGroup().compareTo(i2.getGroup()));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id = sc.nextLine();
            System.out.printf("Danh sach nhom lop mon %s:\n",names.get(id));
            for(Department i:deps){
                if(id.equals(i.getId())){
                    i.show();
                }
            }
        }
    }
}
