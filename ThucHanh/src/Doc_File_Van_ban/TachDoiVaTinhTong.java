package Doc_File_Van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File f  = new File("DATA.in");
        Scanner sc = new Scanner(f);
        String n = "";
        while(sc.hasNextLine()){
            n = sc.nextLine();
        }
        while(n.length() > 1){
            BigInteger n1 = new BigInteger(n.substring(0,n.length()/2));
            BigInteger n2 = new BigInteger(n.substring(n.length()/2));
            BigInteger temp = n1.add(n2);
            System.out.println(temp);
            n = temp.toString();
        }
    }
}
