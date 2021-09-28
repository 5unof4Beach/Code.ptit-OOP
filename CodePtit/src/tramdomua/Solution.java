package tramdomua;

import java.util.Vector;

/**
 *
 * @author suckm
 */
public class Solution{
    private Vector<Station> res = new Vector<Station>();
    private Vector<String> stations = new Vector<String>();
    
    public void addObj(Station obj){
        res.add(obj);
        if(stations.contains(obj.getName())){
                ;
            }
            else{
                stations.add(obj.getName());
            }
    }
    
    private static void printAvg(long amount,long duration){
        double avg = amount/(duration/60.0);
        avg = Math.round(avg*100)/100.0;
        System.out.printf("%.2f \n",avg);
    }
    
    public void processAndPrint(){
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
}
//