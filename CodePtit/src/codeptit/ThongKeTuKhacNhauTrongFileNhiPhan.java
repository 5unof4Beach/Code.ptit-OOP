package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;


public class ThongKeTuKhacNhauTrongFileNhiPhan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f2 = new FileInputStream("DATA.in");
        ObjectInputStream din = new ObjectInputStream(f2);
        ArrayList<String> data = (ArrayList<String>) din.readObject();
        TreeMap<String,Integer> words = new TreeMap<>();
        Vector<String> v = new Vector<>();
        for(String j:data){
            String arr[] = j.toLowerCase().split("\\W+");
            for(String i:arr){
                if(!words.containsKey(i) && !i.equals("")){
                    words.put(i, 1);
                    v.add(i);
                }
                else{
                    if(!i.equals("")){
                        words.put(i,words.get(i)+1);
                    }
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
