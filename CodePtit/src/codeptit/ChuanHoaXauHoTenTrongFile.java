package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author suckm
 */
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            System.out.println(solution(s.toLowerCase()));
        }
    }
    
    public static String solution(String s){
        String res = "";
        String tmp[] = s.trim().split("\\s+");
        for(String i:tmp){
            String temp = i.substring(0,1).toUpperCase() + i.substring(1) + " ";
            res += temp;
        }
        return res;
    }
}
