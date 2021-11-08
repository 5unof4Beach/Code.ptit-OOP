package SoNguyenTrongFileNhiPhan;

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
public class SNTTrongFileBin {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("SONGUYEN.in");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream dis = new ObjectInputStream(fis);
        ArrayList<Integer> numbers = (ArrayList<Integer>) dis.readObject();
        TreeMap<Integer, Integer> res = new TreeMap<>();
        
        for(Integer i:numbers){
            if(isPrime(i) && !res.containsKey(i)){
                res.put(i, 1);
            }
            else if(isPrime(i) && res.containsKey(i)){
                res.put(i, res.get(i) + 1);
            }
        }
        
        for(Integer i:res.keySet()){
            System.out.println(i + " " + res.get(i));
        }
    }
    
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i< (int)(Math.sqrt(n) + 1);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
