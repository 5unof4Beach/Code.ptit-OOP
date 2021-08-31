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
public class UocSoChiaHetCho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {            
            int c=0 , res =1;
            long n = sc.nextLong();
            if(n % 2 == 1) 
                System.out.println("0");
            else{
                
                while(n%2==0){ //n co dang 2^k * m
                    n/=2;
                    c++;
                }
                res *= c;

                if(n > 1){
                    c = 2;
                    for(long i = 3;i<(int)n/2;i++){
                        if(n%i==0){
                            c++;
                            
                        }
                    }
                    System.out.println(c);
                    res *= c;
                }
                System.out.println(res);
            }
        }
        
        
    }
    
}
