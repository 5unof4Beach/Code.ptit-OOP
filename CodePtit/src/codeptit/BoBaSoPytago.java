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
public class BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            int n = sc.nextInt();
            Boolean exist = false;
            Vector<Long> data = new Vector<Long>();
            Hashtable<Long , Integer> hash = new Hashtable<Long , Integer>();
            
            for(int i = 0;i<n;i++){
                long temp = sc.nextLong();
                temp *= temp;
                data.add(temp);
                if (hash.contains(temp)){
                    hash.put(temp,hash.get(temp) + 1);
                }
                else{
                    hash.put(temp,1);
                }
            }
    //        System.out.println(hash);
    //        System.out.println(data.elementAt(0));
            long temp = 0;
            for(int i = 0;i<n-1;i++){
                for(int j = i+1;j<n;j++){
                    if(hash.containsKey(data.elementAt(i) + data.elementAt(j))){
    //                    System.out.println("Yes");
                        exist = true;
                        break;
                    }
                }
                if(exist) break;
            }

            if(exist){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
