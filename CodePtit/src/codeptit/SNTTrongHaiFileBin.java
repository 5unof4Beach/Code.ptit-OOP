package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author suckm
 */
public class SNTTrongHaiFileBin {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fos1 = new FileInputStream("DATA1.in");
        ObjectInputStream ois1 = new ObjectInputStream(fos1);
        
        FileInputStream fos2 = new FileInputStream("DATA2.in");
        ObjectInputStream ois2 = new ObjectInputStream(fos2);
        
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        
        for(Integer i: list1){
            if(tm1.containsKey(i)){
                tm1.put(i, tm1.get(i) + 1);
            }
            else{
                if(isPrime(i)){
                    tm1.put(i, 1);
                }
            }
        }
        for(Integer i: list2){
            if(tm2.containsKey(i)){
                tm2.put(i, tm2.get(i) + 1);
            }
            else{
                if(isPrime(i)){
                    tm2.put(i, 1);
                }
            }
        }
        for(Integer i:tm1.keySet()){
            if(tm1.containsKey(i) && tm1.containsKey(i)){
                System.out.println(i + " " + tm1.get(i) + " " + tm2.get(i));
            }
        }
    }
    
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= (int) (Math.sqrt(n));i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
