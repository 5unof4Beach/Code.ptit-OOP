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
public class TichMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 1;
        while(t-->0){
            
            int r = sc.nextInt(), c = sc.nextInt();
            long mat[][] = new long[r][c];
            long matT[][] = new long[c][r];
            long res[][] = new long[r][r];

            //khoi tao tat ca phan tu trong matrix = 0
            for(long[] row:res)
                Arrays.fill(row, 0);

    //        System.out.println(res[1][0]);
            for(int i=0 ; i< r;i++){
                for(int j = 0;j<c;j++){
                    mat[i][j] = sc.nextLong();
                    matT[j][i] = mat[i][j];
                }
            }
            for(int i = 0;i<r;i++){
                for(int j = 0;j<r;j++){
                    for(int k = 0;k<c;k++){
                        res[i][j] += mat[i][k] * matT[k][j];
                    }
                }
            }
            System.out.println("Test " + count + ":");
            count++;
            for(int i = 0;i<r;i++){
                for(int j = 0;j<r;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
        
    }
}
