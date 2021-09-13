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
public class LietKeVaDem {
    public static HashMap<Long , Integer> valid = new HashMap<Long , Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Long> invalid = new HashSet<Long>();
        Vector<Long> res = new Vector<Long>();
//        int n = sc.nextInt();
        while(sc.hasNext()){
            long temp = sc.nextLong();
            if( valid.containsKey(temp) ){
                valid.put(temp,valid.get(temp)+1);
            }
            else if(invalid.contains(temp)){
                continue;
            }
            else{
                if(isNonDecreasing(temp)){
                    valid.put(temp,1);
                    res.add(temp);
                }
                else{
                    invalid.add(temp);
                }
            }
        }
        Collections.sort(res,(i1,i2)->valid.get(i2).compareTo(valid.get(i1)));
        for(long element:res)
            System.out.println(element + " " + valid.get(element));
        
    }
    
    
    public static boolean isNonDecreasing(long n){
        while(n>9){
            if(n%10 < (n/10)%10){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}

    



//        while(true){
//            
//            long n = sc.nextLong();
//            if(isNonDecreasing(n)){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//        }