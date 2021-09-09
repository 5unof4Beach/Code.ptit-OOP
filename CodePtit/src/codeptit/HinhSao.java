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
public class HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer , Integer> hash = new HashMap<Integer , Integer>();
        
        int t = sc.nextInt();
        int e = t;
        while(t-->1){
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            if(hash.containsKey(p1)){
                hash.put(p1,hash.get(p1)+1);
            }
            else{
                hash.put(p1, 1);
            }
            
            if(hash.containsKey(p2)){
                hash.put(p1,hash.get(p2)+1);
            }
            else{
                hash.put(p2, 1);
            }
        }
        int count1 = 0;
        int count2 = 0;
        for (Map.Entry<Integer, Integer> set :hash.entrySet()){
            if(set.getValue()==1) count1++;
            else count2++;
        }
        
        if((count1 + count2) == e){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
