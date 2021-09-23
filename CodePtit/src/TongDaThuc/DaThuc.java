package TongDaThuc;

import java.util.*;
import java.util.StringTokenizer;

public class DaThuc {
    private String s;
    private HashMap<Long,Long> heSoVaBac = new HashMap<Long,Long>();
    public DaThuc(String s){
        this.s = s;
        setHeSoVaBac();
    }
    public DaThuc(HashMap<Long,Long> heSoVaBac){
        this.heSoVaBac = heSoVaBac;
    }

    public HashMap<Long, Long> getHeSoVaBac() {
        return heSoVaBac;
    }
    
    public void setHeSoVaBac() {
        StringTokenizer res = new StringTokenizer(s," + ");
        while(res.hasMoreTokens()){
            String temp = res.nextToken().toString();
            String bac = temp.substring(temp.indexOf('^')+1);
            String heSo = temp.substring(0,temp.indexOf('*'));
            heSoVaBac.put(convert(bac),convert(heSo));
        }
        this.heSoVaBac = heSoVaBac;
    }
    
    public long convert(String s){
        long res = 0;
        for(int i=0;i<s.length();i++){
            res = res*10 + (s.charAt(i) - '0');
        }
        return res;
    }
    public DaThuc cong(DaThuc temp){
        long n =0;
        Iterator<Long> i = temp.getHeSoVaBac().keySet().iterator();
        while(i.hasNext()){
            long key = i.next().longValue();
            if(heSoVaBac.containsKey(key)){
                heSoVaBac.put(key, temp.getHeSoVaBac().get(key) + heSoVaBac.get(key));
            }
            else{
                heSoVaBac.put(key,temp.getHeSoVaBac().get(key));
            }
        }
        return new DaThuc(heSoVaBac);
    }
    @Override
    public String toString(){
        Iterator i = heSoVaBac.entrySet().iterator();
        Vector<String> temp = new Vector<String>();
        Vector<Map.Entry> listToResort = new Vector<Map.Entry>();
        String res = "";
        while(i.hasNext()){
            Map.Entry j = (Map.Entry)i.next();
            listToResort.add(j);
        }
//   vì một lí do nào đó mà số mũ 10000 in ra ko đúng thứ tự nên phải sort lại
        listToResort.sort((i1,i2)->Long.compare(convert(i2.getKey().toString()),
                                        convert(i1.getKey().toString())));
        for(Map.Entry j:listToResort){
            res = j.getValue() + "*x^" + j.getKey();
            temp.add(res);
        }
        res = "";
        for(int k=0; k<temp.size() ;k++){
            if(k == temp.size()-1)
                res += temp.elementAt(k);
            else
                res += temp.elementAt(k) + " + ";
        }
        return res;
    }
}
