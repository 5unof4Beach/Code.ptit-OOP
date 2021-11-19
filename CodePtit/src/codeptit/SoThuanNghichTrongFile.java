package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author suckm
 */
public class SoThuanNghichTrongFile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA1.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        
        f = new FileInputStream("DATA2.in");
        ois = new ObjectInputStream(f);
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
        
        TreeSet<Integer> set = new TreeSet<>();
        
        ArrayList<Integer> union = new ArrayList<Integer>();
        union.addAll(list1);
        union.addAll(list2);
        set.addAll(union);
        
        int count = 0;
        for(Integer i:set){
            if(isPalindrome(i) && list1.contains(i) && list2.contains(i)){
                System.out.println(i + " " + count(i, union));
                count++;
            }
            if(count == 10){
                break;
            }
        }
    }
    
    public static boolean isPalindrome(int n){
        String s = String.valueOf(n);
        int l = s.length();
        if(l % 2 == 0 || l == 1){
            return false;
        }
        else{
            for(int i = 0;i<=l/2;i++){
                Character temp = s.charAt(i);
                int tempVal = Integer.parseInt(temp.toString());
                if(temp != s.charAt(l - i -1) || tempVal % 2 == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static long count(int n, ArrayList<Integer> union){
        int res = 0;
        for(Integer i:union){
            if(i == n){
                res++;
            }
        }
        return res;
    }
}
