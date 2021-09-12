/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;
import java.util.*;

/**
 *
 * @author suckm
 */
public class TimTuThuanNghichDaiNhat {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String data ="";
        //hash để đếm số lần xuất hiện
        HashMap<String , Integer> hash = new HashMap<String , Integer>();
        
        //Vector để lưu những phần tử thuận nghich,mỗi phần tử chỉ lưu 1 lần
        Vector<String> noDup = new Vector<String>();
        
        while(sc.hasNext()){
            data = sc.next();
            if(isThuanNghich(data)){
                if(hash.containsKey(data)){
                    hash.put(data,hash.get(data)+1);
                }
                else{
                    noDup.add(data);
                    hash.put(data,1);
                }
            }
        }
        
        Collections.sort(noDup, Comparator.comparingInt(String::length).reversed());
        int max_len = noDup.elementAt(0).length();
        for(int i=0;i<noDup.size();i++){
            if(noDup.elementAt(i).length() == max_len)
                System.out.println(noDup.elementAt(i) +" "+ hash.get(noDup.elementAt(i)));
        }
        sc.close();
    }
    
    public static boolean isThuanNghich(String s){
        StringBuilder temp = new StringBuilder(s);
        String rs = temp.reverse().toString();
        return s.equals(rs);
    }
}
