package XepHangCheckIn;

import java.util.*;
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Khach> res = new Vector<Khach>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            long arrival = sc.nextLong();
            long time = sc.nextLong();
            sc.nextLine();
            Khach temp = new Khach(arrival, time);
            res.add(temp);
        }
        res.sort((i1,i2)->Long.compare(i1.getArrival(), i2.getArrival()));
        long timeDone = 0;
        timeDone = res.get(0).getArrival() + res.get(0).getTime();
        for(int i=1;i<res.size();i++){
            if(timeDone > res.get(i).getArrival()){
                timeDone += res.get(i).getTime();
            }
            else{
                timeDone = res.get(i).getArrival() + res.get(i).getTime();
            }
        }
        System.out.println(timeDone);
    }
}
