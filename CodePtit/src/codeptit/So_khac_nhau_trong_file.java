package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author suckm
 */
public class So_khac_nhau_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        File f  = new File("DATA.in");
        Scanner sc = new Scanner(f);
        TreeMap<Integer,Integer> numbers = new TreeMap<>();
        String n = "";
        while(sc.hasNext()){
            n = sc.next();
            int temp = Integer.parseInt(n);
            if(!numbers.containsKey(temp)){
                numbers.put(temp,1);
            }
            else{
                numbers.put(temp, numbers.get(temp)+1);
            }
        }
        for(Integer i:numbers.keySet()){
            System.out.println(i + " " + numbers.get(i));
        }
    }
}
