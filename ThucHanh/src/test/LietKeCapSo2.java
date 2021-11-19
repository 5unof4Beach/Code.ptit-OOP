package test;

import java.io.*;
import java.util.*;

public class LietKeCapSo2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        ArrayList<Pair> pairs = (ArrayList<Pair>) ois.readObject();
        LinkedHashSet<String> ts = new LinkedHashSet<>();
//        HashSet<String> ts = new HashSet<>();
        //Phai dung LinkedHashSet de giu nguyen thu tu ban dau
        for(Pair i:pairs){
            if(i.getFirst() < i.getSecond() && gcd(i.getFirst(), i.getSecond()) == 1)
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
    
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
             
        return gcd(b % a, a);
    }
}

