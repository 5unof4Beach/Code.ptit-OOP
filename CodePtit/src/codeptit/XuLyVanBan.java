/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author suckm
 */
public class XuLyVanBan {
    public static void main(String[] args) throws FileNotFoundException {
//        File f = new File("C:\\Users\\suckm\\OneDrive\\Desktop\\Test.txt");
        Scanner sc = new Scanner(System.in);
        String temp = "";
        while(sc.hasNextLine()){
            temp += sc.nextLine();
        }
        
        temp = temp.replaceAll("\\s+", " ");
        String res[] = temp.split("[.?!]");
        for(String a:res){
            a = a.trim();
            a = a.toLowerCase();
            a = a.substring(0,1).toUpperCase() + a.substring(1);
            System.out.println(a);
        }
        
    }
}
