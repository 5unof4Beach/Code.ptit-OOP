package xephanghocsinh;
import java.util.*;

public class BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Pupil> res = new Vector<Pupil>();
        Vector<Pupil> temp = new Vector<Pupil>();
        HashMap<Double,Integer> type = new HashMap<Double,Integer>();
        for(int i = 1;i<=n;i++){
            String name = sc.nextLine();
            double avg = sc.nextDouble();
            sc.nextLine();
            Pupil hs = new Pupil(i,name,avg);
            res.add(hs);
            temp.add(hs);
            
        }
        res.sort((i1,i2)->Double.compare(i2.getAvg(), i1.getAvg()));
        int i = 0;
        
        for(Pupil j:res){
            if(type.containsKey(j.getAvg())){
                j.setRank(type.get(j.getAvg()));
                i++;
            }
            else{
                i++;
                type.put(j.getAvg(),i);
                j.setRank(i);
            }
        }
        res.sort((i1,i2)->Integer.compare(i2.getRank(), i1.getRank()));
        for(Pupil element : temp){
            element.show();
        }
    }
}


