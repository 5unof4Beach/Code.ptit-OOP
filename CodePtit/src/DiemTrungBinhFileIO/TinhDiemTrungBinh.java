package DiemTrungBinhFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author suckm
 */
public class TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        Vector<SinhVien> svs = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++){
            String name = sc.nextLine().trim();
            int d1 = Integer.parseInt(sc.nextLine().trim());
            int d2 = Integer.parseInt(sc.nextLine().trim());
            int d3 = Integer.parseInt(sc.nextLine().trim());
            SinhVien s = new SinhVien(i, name, d1, d2, d3);
            svs.add(s);
        }
        svs.sort((i1, i2) -> Double.compare(i2.getAvg(), i1.getAvg()));
        HashMap<Double , Integer> ranks = new HashMap<>();
        int i = 0;
        
        for(SinhVien j:svs){
            if(ranks.containsKey(j.getAvg())){
                j.setRank(ranks.get(j.getAvg()));
                j.show();
                i++;
            }
            else{
                i++;
                j.setRank(i);
                j.show();
                ranks.put(j.getAvg(), i);
            }
        }
    }
}

class SinhVien{
    private String name, id;
    private int d1, d2, d3, rank;
    private double avg;

    public SinhVien(int i, String name, int d1, int d2, int d3) {
        id = String.format("SV%02d", i);
        this.name = stdize(name);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        setAvg();
    }

    public double getAvg() {
        return avg;
    }
    
    private void setAvg(){
        double temp = (d1*3 + d2*3 + d3*2)/8.0;
        avg = Math.ceil(temp*100)/100.0;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public String stdize(String name){
        String res = "";
        String[] temp = name.toLowerCase().split("\\s+");
        
        for(String i:temp){
            res += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }
    
    public void show(){
        System.out.printf("%s %s %.2f %d\n", id, name, avg, rank);
    }
}