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
public class XauNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long len[] = new long[n+1];
            len[1] = 1;
            len[2] = 1;
            long l1 = 1,l2=1;
            for(int i = 3;i<=n;i++){
                len[i] = l1 + l2;
                l1 = l2;
                l2 = len[i];
            }
            System.out.println(find(n,k,len));
        }
    }
    
    public static int find(int n,long k,long len[]){
        while(n>2){
            if(k>len[n-2]){
                k-=len[n-2];
                n -= 1;
            }
            else{
                n-=2;
            }
        }
        if(n==1){
            return 0;
        }
        else{
            return 1;
        }
    }
}
