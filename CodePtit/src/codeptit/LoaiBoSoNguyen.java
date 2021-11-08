package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author suckm
 */
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Vector<String> list = new Vector<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.next();
            try{
                Integer.parseInt(s);
            }catch(NumberFormatException e){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String i: list){
            System.out.print(i + " ");
        }
    }
}
