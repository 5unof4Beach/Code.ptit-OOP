package xephanghocsinh;

import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class Solution{
    private HashMap<Double,Integer> type = new HashMap<Double,Integer>();
    private Vector<Pupil> res = new Vector<Pupil>();
    
    public void addObject(Pupil obj){
        res.add(obj);
    }
    
    public void processAndPrint(){
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
        res.sort((i1,i2)->i1.getID().compareTo(i2.getID()));
        for(Pupil element : res){
            element.show();
        }
    }
}
    



