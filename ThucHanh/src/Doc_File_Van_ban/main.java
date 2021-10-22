package Doc_File_Van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        File f  = new File("DATA.in");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        
    }
}
