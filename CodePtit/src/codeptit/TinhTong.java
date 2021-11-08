package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Vector<String> list = new Vector<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.parseInt(s);
                res += n;
            }catch(NumberFormatException e){
            }
        }
        System.out.println(res);
    }
}
