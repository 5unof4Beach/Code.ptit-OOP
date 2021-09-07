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
public class UocSoNguyenToLonNhat {
    
    public static boolean isPrime(long n){
        for(int i = 2;i<=(long)Math.sqrt(n)+1;i++){
            if(n % i ==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long num = sc.nextLong();
            long max = 0;
            boolean flag = true;
            if(isPrime(num)){
                flag = false;
                System.out.println(num);
            }
            if(flag){
                
                while(num % 2 ==0){
                    max = 2;
                    num /= 2;
                }
                while(num % 3 == 0){
                    max = 3;
                    num/=3;
                }
                
                for(long i = 5;i<=Math.sqrt(num);i+=6){
                    while(num % i ==0){
                        max = i;
                        num /= i;
                    }
                    while(num % (i+2) == 0){
                        max = i+2;
                        num /= (i+2);
                    }
                }
                if(isPrime(num)){
                    max = num;
                }
            System.out.println(max);
            }
        }
        
    }
}