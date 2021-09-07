/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhchunhat;
import java.util.*;
import hinhchunhat.Rectangle;
/**
 *
 * @author suckm
 */
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        double cd = sc.nextDouble();
        double cr = sc.nextDouble();
        String color = sc.next();
        if(cd <= 0 || cr <=0){
            System.out.println("INVALID");
            flag = false;
        }
        if(flag){
            Rectangle rect = new Rectangle(cd,cr,color);
            System.out.print((int)rect.findPerimeter() + " ");
            System.out.print((int)rect.findArea() + " ");
            System.out.print(rect.getColor());
            
            
        }
    }
}
