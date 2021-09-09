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
public class TinhLuyThua {
    public static long cst = 1000000000 + 7;
    
    public static long pow(long a,long b){
        if(a == 0) return 0;
        long res = 1;
        a = a % cst;
        
        while(b > 0){
            if( b % 2 == 1){
                res = (res*a) % cst;
            }
            b /= 2;
            a = (a*a) % cst;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        long res = 1 ;
        long a = sc.nextLong(),b = sc.nextLong();
        while( a!=0 || b!=0 ){
            res = pow(a,b);
            System.out.println(res);
            a = sc.nextLong();b = sc.nextLong();
        }
    }
}
