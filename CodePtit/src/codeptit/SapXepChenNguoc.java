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
public class SapXepChenNguoc {

    public static String res[] = new String[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long temp;
        long[] arr = new long[n];
        // nhap mang
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        
        // cai dat thuat toan insertion sort
        long val;
        int hole;
        for(int i=1;i<n;i++){
            val = arr[i];
            hole = i;
            add(i, arr);
            while(hole > 0 && arr[hole - 1] > val)
            {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = val;
        }
      
        add(n, arr);
        print(n);
    }
    
    public static void add(int count,long arr[]){
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<count;i++){
            temp.append(arr[i] + " ");
        }
        res[count - 1] = temp.toString();
    }
    
    public static void print(int n){
        for(int i=n-1;i>=0;i--){
            System.out.println("Buoc " + i + ": " + res[i]);
        }
    }
}
