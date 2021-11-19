package Buoi4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class BaiLoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

class LoaiPhong implements Comparable<LoaiPhong>{
    String name, infos;

    public LoaiPhong(String info) {
        this.infos = info;
        String[] infos = info.split(" ");
        this.name = infos[1];
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return getName().compareTo(o.getName());
    }
    
    @Override
    public String toString(){
        return infos;
    }
}
