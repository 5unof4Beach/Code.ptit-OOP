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
public class CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            HashMap<Long , Integer> hash = new HashMap<Long , Integer>();
            int n1 = sc.nextInt();
            long sum = sc.nextLong();
            int count = 0;
            long arr[] = new long[n1];
            for(int i = 0; i<n1; i++){
                arr[i] = sc.nextLong();
                if(hash.containsKey(arr[i])){
                    hash.put(arr[i],hash.get(arr[i])+1);
                }
                else{
                    hash.put(arr[i],1);
                }
            }
            for(int i=0;i<n1;i++){
                if(hash.get(sum - arr[i]) != null){
                    count += hash.get(sum - arr[i]);
                }
    //      tranh truong hop trung so
                if(sum - arr[i] == arr[i]) count--;
            }
    //      ly do vi moi cap dem 2 lan 
            int res = count / 2;
            System.out.println(res);
            
        }
    }
}
