package hello_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class HelloFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Hello.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
