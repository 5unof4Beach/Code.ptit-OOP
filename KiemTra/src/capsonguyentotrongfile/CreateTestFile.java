package capsonguyentotrongfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class CreateTestFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream f = new FileOutputStream("DATA1.in");
        ObjectOutputStream ois1 = new ObjectOutputStream(f);
        
        FileOutputStream f2 = new FileOutputStream("DATA2.in");
        ObjectOutputStream ois2 = new ObjectOutputStream(f);
        
        ArrayList<Integer> union = new ArrayList<Integer>();
        
        union.add(13);
        union.add(11);
        union.add(333);
        union.add(1356531);
        union.add(1);
        union.add(555);
        ois1.writeObject(union);
        ois2.writeObject(union);
    }
}
