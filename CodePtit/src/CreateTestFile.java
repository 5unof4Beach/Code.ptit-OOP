

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
        
        FileOutputStream f2 = new FileOutputStream("DATA.in");
        ObjectOutputStream ois2 = new ObjectOutputStream(f2);
        
        ArrayList<Integer> union = new ArrayList<Integer>();
        
        union.add(13);
        union.add(11);
        union.add(333);
        union.add(1357531);
        union.add(1);
        union.add(111);
        union.add(777);
        union.add(999);
        union.add(7779777);
        union.add(9997999);
        union.add(1115111);
        union.add(5551555);
        union.add(5553555);
        union.add(5555555);
        union.add(5557555);
        union.add(5559555);
        union.add(5571755);
        union.add(5571755);
        union.add(555);
        union.add(555);
        union.add(555);
        ois1.writeObject(union);
        ois2.writeObject(union);
    }
}
