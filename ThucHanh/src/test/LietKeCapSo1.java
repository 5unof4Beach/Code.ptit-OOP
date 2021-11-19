package test;

import java.io.*;
import java.util.*;

public class LietKeCapSo1 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        ArrayList<Pair> pairs = (ArrayList<Pair>) ois.readObject();
        LinkedHashSet<String> ts = new LinkedHashSet<>();
        //Phai dung LinkedHashSet de giu nguyen thu tu ban dau
//        HashSet<String> ts = new HashSet<>();
        for(Pair i:pairs){
            if(i.getFirst() < i.getSecond())
                ts.add(i.getFirst() + " " + i.getSecond());
        }
        
        Vector<Pair> res = new Vector<>();
        for(String i:ts){
            String[] temp = i.split(" ");
            res.add(new Pair(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
        }
        Collections.sort(res);
        for(Pair i:res){
            System.out.println(i);
        }
    }
}

