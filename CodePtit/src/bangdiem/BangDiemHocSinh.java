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
            String name = sc.nextLine();
            double avg = 0;
            for(int j=0;j<10;j++){
                double temp = Double.parseDouble(sc.next());
                if(j == 0 || j==1){
                    avg += temp*2;
                }
                else{
                    avg += temp;
                }
            }
            sc.nextLine();
            avg /= 12;
            HocSinh hs = new HocSinh(i,name,avg);
            res.add(hs);
            
        }
        res.sort((i1,i2)->Double.compare(i2.getAvg(), i1.getAvg()));
        for(HocSinh element : res){
            element.show();
        }
    }
}

