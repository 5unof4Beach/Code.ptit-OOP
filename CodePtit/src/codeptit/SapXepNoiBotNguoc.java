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
public class SapXepNoiBotNguoc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            String res[] = new String[100];
            int c = 0;
            int flag = 1;
            int count = 1;
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0 ; i<n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0;i<n;i++){
                flag = 0;
                for(int j=0;j<n-1;j++){
                    if( a[j] > a[j+1] ){
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                        flag = 1; 
                    }
                }
                if(flag == 1){
                    c++;
                    StringBuilder tmp = new StringBuilder();
                    for(long element : a){
                        tmp.append(element);
                        tmp.append(" ");
                    }
                    res[i] = tmp.toString();
                }
            }
            for(int i=c-1;i>=0;i--){
            System.out.println("Buoc " + (i+1) + ": " + res[i]);
            }
        }
    }
}
