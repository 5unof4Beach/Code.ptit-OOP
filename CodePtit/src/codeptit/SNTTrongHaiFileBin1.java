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
public class SNTTrongHaiFileBin1 {
    static int[] primes = new int[10002];
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        
        FileInputStream fos = new FileInputStream("DATA1.in");
        ObjectInputStream ois = new ObjectInputStream(fos);
        
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        
        fos = new FileInputStream("DATA2.in");
        ois = new ObjectInputStream(fos);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
        
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();
        TreeMap<Integer, Integer> tm2 = new TreeMap<>();
        
        for(Integer i: list1){
            if(tm1.containsKey(i)){
                tm1.put(i, tm1.get(i) + 1);
            }
            else{
                if(primes[i] == 1 && isPalindrome(i)){
                    tm1.put(i, 1);
                }
            }
        }
        for(Integer i: list2){
            if(tm2.containsKey(i)){
                tm2.put(i, tm2.get(i) + 1);
            }
            else{
                if(primes[i] == 1 && isPalindrome(i)){
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
    
    static boolean isPalindrome(int n){
        String n1 = String.valueOf(n);
        int l = n1.length();
        
        for(int i=0; i < n1.length()/2; i++){
            if(n1.charAt(i) != n1.charAt(l-i-1)) {
                return false;
            }
        }
        return true;
    }
    
     public static void sieve(){
        Arrays.fill(primes, 1);
        primes[0] = 0;
        primes[1] = 0;
        for(int i = 2; i <= 10001; i++){
            if(primes[i] == 1){
                for(int j = i*i; j <= 10001; j += i){
                    primes[j] = 0;
                }
            }
        }
    }
}
