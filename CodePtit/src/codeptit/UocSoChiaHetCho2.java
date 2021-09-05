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
public class UocSoChiaHetCho2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long n = sc.nextLong();
            int res = 0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    if(i%2 == 0)
                        res++;
                    if((n/i)%2 == 0 && n/i != i)
                        res++;
                }
            }

            System.out.println(res);
        }
    }
}
