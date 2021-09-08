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
public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            int slices = sc.nextInt();
            int h = sc.nextInt();
            for(int i = 1; i < slices ; i++ ){
                System.out.printf("%.6f ",(h*Math.sqrt((double)i/slices)));
            }
            System.out.println("");
        }
    }
}
