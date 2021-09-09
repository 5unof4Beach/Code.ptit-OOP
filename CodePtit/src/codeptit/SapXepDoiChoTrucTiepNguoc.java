/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class SapXepDoiChoTrucTiepNguoc {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            String res[] = new String[100];
            int c = 0;
            int n = sc.nextInt();
            long temp;
            long[] arr = new long[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextLong();
            }

            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        }
                    }

                    c++;
                    StringBuilder tmp = new StringBuilder();
                    for(long element : arr){
                        tmp.append(element);
                        tmp.append(" ");
                    }
                    res[i] = tmp.toString();
                }
            for(int i=c-1;i>=0;i--){
            System.out.println("Buoc " + (i+1) + ": " + res[i]);
            }
        }
    }
}
