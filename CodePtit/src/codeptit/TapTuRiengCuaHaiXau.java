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
public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String s = sc.nextLine();
            String arr1[] = s.split(" ");
            s = sc.nextLine();
            String arr2[] = s.split(" ");
            String temp[] = new String[20];
            HashMap<String , Integer> hash1 = new HashMap<String , Integer>();
            HashMap<String , Integer> hash2 = new HashMap<String , Integer>();

            // dua cac tu cua day 1 vao hash va cho vao temp
            Arrays.sort(arr1);
            int count = 0;
            for(int i=0;i<arr1.length;i++){
                if(hash1.containsKey(arr1[i])){
                    continue;
                }
                else{
                    hash1.put(arr1[i],1);
                    temp[count] = arr1[i];
                    count++;
                }
            }

            // dua cac tu cua day 2 vao hash
            for(int i=0;i<arr2.length;i++){
                if(hash2.containsKey(arr2[i])){
                    continue;
                }
                else{
                    hash2.put(arr2[i],1);

                }
            }

            // kiem tra va in
            
            for(int i=0;i<count;i++){
                if(hash2.containsKey(temp[i])){
                    continue;
                }
                else{
                    System.out.print(temp[i] + " ");
                }
            }
            System.out.println("");
        }
        
    }
}
