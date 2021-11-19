package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author suckm
 */
public class SoNguyenToLonNhattrongFIle {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer, Integer> count = new HashMap<>();
        
        list.sort((i1, i2) -> Integer.compare(i2, i1));
        
        int c = 0;
        for(Integer i:list){
            if(count.containsKey(i)){
                count.put(i, count.get(i)+1);
            }
            else{
                if(c < 10){
                    if(isPrime(i)){
                        c++;
                        count.put(i, 1);
                        res.add(i);
                    }
                }
                else
                    continue;
            }
        }
        
        for(Integer i: res){
            System.out.println(i + " " + count.get(i));
        }
    }
    
    public static boolean isPrime(int n){
        if(n < 2) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i*i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
