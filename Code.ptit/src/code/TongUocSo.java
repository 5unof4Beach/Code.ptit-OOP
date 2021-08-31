/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.ptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class TongUocSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long temp,sum = 0;
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            temp = sc.nextLong();
            for(long j = 2;j<=temp;j++){
                while(temp % j == 0){
                  System.out.print(temp + " ");
                    sum += j;
                    temp /= j;
                }
            }
        }
        System.out.println(sum);
        
    }
    public static int isPrime
    
}
