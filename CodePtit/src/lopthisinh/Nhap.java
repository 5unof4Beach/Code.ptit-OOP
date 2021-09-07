/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopthisinh;
import java.util.*;
import lopthisinh.ThiSinh;
/**
 *
 * @author suckm
 */
public class Nhap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ThiSinh Duc = new ThiSinh(sc.nextLine(),sc.next(),sc.nextDouble()
                                                                ,sc.nextDouble()
                                                                ,sc.nextDouble());
        Duc.printName();
        Duc.printDOB();
        Duc.PrintSum();
    }
}
