/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demsolanxuathien;

import java.util.*;
public class DemSoLanXuatHien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long temp;
        long[] arr = new long[100000];
        for(int i=0;i<n;i++)
        {
            temp = sc.nextLong();
            arr[temp]++;
        }
    }
    
}
