/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhchunhat;

import java.util.*;

/**
 *
 * @author suckm
 */
public class HinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d = sc.nextFloat();
        float r = sc.nextFloat();
        if(d == 0 && r!=0) System.out.println("VN");
        else if(d == (-r) && d==0) System.out.println("VSN");
        else System.out.printf("%.2f",(-r)/d);
    }
    
}
