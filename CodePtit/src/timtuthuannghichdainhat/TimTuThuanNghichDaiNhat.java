/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timtuthuannghichdainhat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 *
 * @author suckm
 */
public class TimTuThuanNghichDaiNhat {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Scanner in = new Scanner(System.in);
//        String url = in.nextLine();
//        in.close();
        String url = "C:\\Users\\suckm\\OneDrive\\Desktop\\Programming\\Java\\OOP\\code.ptit-OOP\\CodePtit\\src\\timtuthuannghichdainhat\\input.txt";
        File f = new File("test.txt");
        FileInputStream input = new FileInputStream(f.getAbsolutePath());
        
        Scanner sc = new Scanner(input);
        String data ="";
        while(sc.hasNextLine()){
            data += sc.nextLine()+" ";
        }
        System.out.println(data);
//        String data = sc.nextLine();
        String a[] = data.split(" ");
        
        //Vector để lưu những phần tử thuận nghich,mỗi phần tử chỉ lưu 1 lần
        Vector<String> noDup = new Vector<String>();
        
        //hash để đếm số lần xuất hiện
        HashMap<String , Integer> hash = new HashMap<String , Integer>();
        
        for(int i = 0;i<a.length;i++){
            if(isThuanNghich(a[i])){
                if(hash.containsKey(a[i])){
                    hash.put(a[i],hash.get(a[i])+1);
                }
                else{
                    noDup.add(a[i]);
                    hash.put(a[i],1);
                }
            }
        }
// 
        Collections.sort(noDup, Comparator.comparingInt(String::length).reversed());
        int max_len = noDup.elementAt(0).length();
        for(int i=0;i<noDup.size();i++){
            if(noDup.elementAt(i).length() == max_len)
                System.out.println(noDup.elementAt(i) +" "+ hash.get(noDup.elementAt(i)));
        }
        sc.close();
    }
    
    public static boolean isThuanNghich(String s){
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
