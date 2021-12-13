package DiemTuyenSinhFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        Vector<ThiSinh> tss = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++){
            String ten = sc.nextLine().trim();
            double diem = Double.parseDouble(sc.nextLine().trim());
            String danToc = sc.nextLine().trim();
            int kv = Integer.parseInt(sc.nextLine().trim());
            ThiSinh ts = new ThiSinh(i, ten, danToc, diem, kv);
            tss.add(ts);
        }
        tss.sort((i1, i2) -> i1.getId().compareTo(i2.getId()));
        tss.sort((i1, i2) -> Double.compare(i2.getDiemThuc(), i1.getDiemThuc()));
        
        for(ThiSinh i:tss){
            i.show();
        }
    }
}

class ThiSinh{
    private String ten, danToc, state, id;
    private int khuVuc;
    private double diemThuc, diemThi;

    public ThiSinh(int i, String ten, String danToc, double diem, int khuVuc) {
        this.id = String.format("TS%02d", i);
        this.ten = chuanHoa(ten);
        this.diemThi = diem;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        setDiemThuc();
    }

    public String getId() {
        return id;
    }

    public double getDiemThuc() {
        return diemThuc;
    }
    
    private String chuanHoa(String name){
        String[] temp = name.toLowerCase().split("\\s+");
        String res = "";
        for(String i:temp){
            res += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }
    
    private void setDiemThuc(){
        this.diemThuc = diemThi;
        if(!danToc.equals("Kinh")) diemThuc += 1.5;
        
        if(khuVuc == 1) diemThuc += 1.5;
        else if(khuVuc == 2) diemThuc += 1;
        
        if(diemThuc >= 20.5) state = "Do";
        else state = "Truot";
    }
    
    public void show(){
        System.out.printf("%s %s %.1f %s\n", id, ten, diemThuc, state);
    }
    
}