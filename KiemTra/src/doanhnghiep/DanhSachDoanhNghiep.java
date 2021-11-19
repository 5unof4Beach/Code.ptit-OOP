package doanhnghiep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> doanhNghiep = new ArrayList<>();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int student = Integer.parseInt(sc.nextLine());
            DoanhNghiep d = new DoanhNghiep(id, name, student);
            doanhNghiep.add(d);
        }
        doanhNghiep.sort((i1,i2) -> i1.getId().compareTo(i2.getId()));
        
        for(DoanhNghiep i:doanhNghiep){
            i.show();
        }
    }
}


class DoanhNghiep {
    private String id, name;
    private int student;

    public DoanhNghiep(String id, String name, int student) {
        this.id = id.trim();
        this.name = name.trim();
        this.student = student;
    }

    public String getId() {
        return id;
    }
    public void show(){
        System.out.printf("%s %s %d\n", id, name, student);
    }
}
