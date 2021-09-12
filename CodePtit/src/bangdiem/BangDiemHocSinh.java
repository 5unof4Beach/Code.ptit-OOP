/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiem;
import java.util.*;
/**
 *
 * @author suckm
 */
public class BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<HocSinh> res = new Vector<HocSinh>();
        
        for(int i = 1;i<=n;i++){
            HocSinh hs = new HocSinh(i,sc);
            res.add(hs);
        }
        Collections.sort(res , new myCompare());
        for(HocSinh element : res){
            element.show();
        }
    }
}

class myCompare implements Comparator<HocSinh>{
    public int compare(HocSinh h1,HocSinh h2){
        if(h1.getAvg() < h2.getAvg()) return 1;
        else return -1;
    }          
}