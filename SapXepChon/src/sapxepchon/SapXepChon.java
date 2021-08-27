/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxepchon;

import java.util.*;

/**
 *
 * @author suckm
 */
public class SapXepChon {

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
        
        // cai dat thuat toan selecton sort
        int min;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // doi vi tri
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
            // in ra man hinh
            System.out.print("Buoc " + (i+1) +": ");
            for(long element : arr){
                System.out.print(element+" ");
            }
            System.out.println("\n");
            
            
        }
    }
    
    
}
