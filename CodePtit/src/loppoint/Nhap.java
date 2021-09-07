/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loppoint;
import java.util.*;
import loppoint.Point;
/**
 *
 * @author suckm
 */
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
            double x1 = p1.distance(p2),x2=p1.distance(p3),x3=p1.distance(p2, p3);
            boolean flag = true;
            if(x1+x2<=x3 || x1+x3<=x2 || x2+x3<=x1){
                System.out.println("INVALID");
                flag = false;
            }
            if(flag){
                //chu vi
//                System.out.printf("%.3f",x1+x2+x3);
                System.out.printf("%.2f",Math.sqrt( (x1+x2+x3)
                                                  * (x1+x2-x3)
                                                  * (x1+x3-x2)
                                                  * (x2+x3-x1))/4);
            }
            System.out.println("");
        }
    }
}
