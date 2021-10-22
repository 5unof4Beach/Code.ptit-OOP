package Doc_File_Van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class ThongKeTuKhacNhauTrongVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeMap<String,Integer> words = new TreeMap<>();
        Vector<String> v = new Vector<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String temp = sc.nextLine().toLowerCase();
            String arr[] = temp.split("\\W+");
            for(String i:arr){
                if(!words.containsKey(i)){
                    words.put(i, 1);
                    v.add(i);
                }
                else{
                    words.put(i,words.get(i)+1);
                }
            }
        }
        v.sort((i1,i2)->i1.compareTo(i2));
        v.sort((i1,i2)->Integer.compare(words.get(i2), words.get(i1)));
        
        for(String i:v){
            System.out.println(i + " " + words.get(i));
        }
    }
}
