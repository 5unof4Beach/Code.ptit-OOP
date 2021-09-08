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
public class DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 1;i<=n;i++){
            if(i!=1)
                System.out.printf("List(%d) = ",i);
            for(int j=1;j<=n;j++){
                int temp = 0;
                temp = sc.nextInt();
                if(i==1 && flag){
                    System.out.printf("List(%d) = ",i);
                    flag = false;
                }
                if(temp == 1){
                    System.out.printf("%d ",j);
                }
            }
            System.out.println("");
        }
    }
}
