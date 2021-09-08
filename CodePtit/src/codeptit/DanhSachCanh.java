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
public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int temp = 0;
                temp = sc.nextInt();
                if(temp == 1 && j>i){
                    System.out.printf("(%d,%d)\n",i,j);
                }
            }
        }
    }
}
