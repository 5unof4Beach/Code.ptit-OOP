package vandongvien;

import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class Solution{
    private Vector<Athlete> res = new Vector<Athlete>();
    private HashMap<Long , Integer> ranks = new HashMap<Long , Integer>();
    
    public void addObject(Athlete obj){
        res.add(obj);
    }
    
    public void ranking(){
        //xếp hạng
        res.sort((i1,i2)->Long.compare(i1.getTimeCompleteInSeconds(), i2.getTimeCompleteInSeconds()));
        int i = 0;
        for(Athlete j:res){
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
    }
    public void sortByID(){
        res.sort((i1,i2)->i1.getID().compareTo(i2.getID()));
    }
    
    public void sortByRank(){
        res.sort((i1,i2)->Long.compare(i1.getTimeCompleteInSeconds(), i2.getTimeCompleteInSeconds()));
    }
    
    public void show(){
        for(Athlete j:res){
            j.show();
        }
    }
}
