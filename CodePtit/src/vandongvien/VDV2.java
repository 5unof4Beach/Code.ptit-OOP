package vandongvien;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author suckm
 */
public class VDV2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Athlete> res = new Vector<Athlete>();
        Vector<Athlete> temp = new Vector<Athlete>();
        HashMap<Long , Integer> ranks = new HashMap<Long , Integer>();
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            String start = sc.nextLine();
            String finish = sc.nextLine();
            Athlete at = new Athlete(i,name,dob,start,finish);
            res.add(at);
            temp.add(at);
            
        }
        temp.sort((i1,i2)->Long.compare(i1.getTimeCompleteInSeconds(), i2.getTimeCompleteInSeconds()));
        int i = 0;
        //xếp hạng
        for(Athlete j:temp){
            if(ranks.containsKey(j.getTimeCompleteInSeconds())){
                j.setRank(ranks.get(j.getTimeCompleteInSeconds()));
                i++;
            }
            else{
                i++;
                j.setRank(i);
                ranks.put(j.getTimeCompleteInSeconds(), i);
            }
        }
        //in
        for(Athlete j:temp){
            j.show();
        }
    }
}
