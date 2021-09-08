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
public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0){
            
            String s1 = sc.next();
            String s2 = sc.next();
            int n1 = s1.length() , n2 = s2.length();
            if(n1 != n2){
                System.out.println(Math.max(n1,n2));
            }
            else{
                if(s1.equals(s2)){
                    System.out.println(-1);
                }
                else{
                    System.out.println(n1);
                }
            }
        }
//        int mat[][] = new int[n1+1][n2+1];
//        for(int[] row:mat)
//            Arrays.fill(row, 0);
//        for(int i=1; i<=n1 ;i++){
//            for(int j=1; j<=n2 ;j++){
//                if( s1.charAt(i-1) == s2.charAt(j-1) ){
//                    mat[i][j] = mat[i-1][j-1] + 1;
//                }
//                else{
//                    mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
//                }
//            }
//        }
//        int max_com_seq = mat[n1][n2];
//        res = 
//        System.out.println(max_com_seq);
    }
}
