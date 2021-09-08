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
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long cst = 1000000000 + 7;
        long res = 1 ;
        long a = sc.nextLong(),b = sc.nextLong();
        while( a!=0 && b!=0 ){
            res = 1;
            for(int i = 0;i<b;i++){
                res *= a;
                res %= cst;
            }
        System.out.println(res);
        a = sc.nextLong();b = sc.nextLong();
        }
    }
}
