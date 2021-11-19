package test;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author suckm
 */
public class DataCreate {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("Data.in");
        ObjectOutputStream ois = new ObjectOutputStream(f);
        ArrayList<Pair> dat = new ArrayList<>();
        dat.add(new Pair(1,2));
        dat.add(new Pair(1,2));
        dat.add(new Pair(1,2));
        dat.add(new Pair(3,11));
        dat.add(new Pair(2,4));
        dat.add(new Pair(2,3));
        dat.add(new Pair(2,4));
        dat.add(new Pair(5,6));
        dat.add(new Pair(5,7));
        dat.add(new Pair(5,7));
        dat.add(new Pair(7,8));
        dat.add(new Pair(8,9));
        dat.add(new Pair(10,9));
        dat.add(new Pair(10,2));
        dat.add(new Pair(3,7));
        dat.add(new Pair(4,10));
        ois.writeObject(dat);
        ois.close();
    }
}

//class Pair implements Serializable, Comparable<Pair>{
//    private int first, second;
//
//    public Pair(int first, int second) {
//        this.first = first;
//        this.second = second;
//    }
//    public int getFirst() {return first;}
//    public int getSecond() {return second;}
//    @Override
//    public int compareTo(Pair o) {
//        return this.first - o.first;
//    }
//    @Override
//    public String toString(){
//        return "(" + first + ", " + second + ")";
//    }
//}