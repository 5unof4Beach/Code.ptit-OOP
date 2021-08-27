/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01008;

import java.util.*;
public class J01008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int test_count = 1;
        int t = sc.nextInt();
    
        while(t-->0)
        {
            long n = sc.nextLong();
            System.out.print("Test " + test_count + ": ");
            for (long i=2 ; i<=n;i++)
            {
                c = 0;
                while(n % i ==0)
                {
                    c++;
                    n /= i;
                }
                if(c > 0)
                {
                    System.out.print(i + "(" + c +")"+" ");
                }
            }
            System.out.print("\n");
            test_count++;
//            t--;
        }
    }
}
