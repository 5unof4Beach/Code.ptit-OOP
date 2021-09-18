package tramdomua;

import java.text.ParseException;
import java.util.*;
public class Nhap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Vector<Station> res = new Vector<Station>();
        Vector<String> stations = new Vector<String>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String timeStart = sc.nextLine();
            String timeEnd = sc.nextLine();
            long amount = sc.nextLong();
            sc.nextLine();
            if(stations.contains(name)){
                ;
            }
            else{
                stations.add(name);
            }
            
            Station st = new Station(name, timeStart, timeEnd, amount);
            res.add(st);
        }

        int i = 1;
        for(String j:stations){
            long totalAmount = 0;
            long totalMin = 0;
            double avg;
            System.out.print("T0" + i + " " + j + " ");
            for(Station k:res){
                if(k.getName().equals(j)){
                    totalAmount += k.getAmount();
                    totalMin += k.getDuration();
                }
            }
            printAvg(totalAmount, totalMin);
            i++;
        }
    }
    public static void printAvg(long amount,long duration){
        double avg = amount/(duration/60.0);
        avg = Math.round(avg*100)/100.0;
        System.out.printf("%.2f \n",avg);
    }
}
