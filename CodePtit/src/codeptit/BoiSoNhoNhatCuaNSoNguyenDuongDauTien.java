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
public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            long n1 = sc.nextLong();
            long temp = LCM(1,2);
            for(long i=3;i<=n1;i++){
                temp = LCM(i, temp);
            }
            System.out.println(temp);
        }
    }
    
    public static long GCD(long a,long b){
        if(a == 0) 
            return b;
        return GCD(b%a,a);
    }
    
    public static long LCM(long a, long b){
        return (a/GCD(a, b)) * b;
    }
}
