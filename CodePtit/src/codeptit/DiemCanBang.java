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
public class DiemCanBang {
    public static void balancePoint(int[] a){
        int sumL = 0, sumR=0,n=a.length;
        boolean flag = true;
        for(int i=0;i<n;i++){
            sumR += a[i];
        }
        
        for(int i=0;i<n;i++){
            sumR -= a[i];
            if(sumR == sumL){
                System.out.println(i+1);
                flag = false;
                break;
            }
            sumL += a[i];
            
        }
        if(flag)
            System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            } 
            balancePoint(a);
        }
    }
}
