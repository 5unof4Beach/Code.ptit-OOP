/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;

import java.util.*;
public class MangDoixung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            
            int n = sc.nextInt();   
            long[] arr ;
            arr = new long[n];

            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextLong();
            }


            int flag = 1;
            for(int i = 0;i < n/2;i++)
            {
                if(arr[i] != arr[n-1-i])
                {
                    System.out.println("NO");
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("YES");
            }
        }
        
    }
    
}
