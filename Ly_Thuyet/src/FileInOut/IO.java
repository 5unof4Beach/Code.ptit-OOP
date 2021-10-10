package FileInOut;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author suckm
 */
public class IO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        for(int i=0;i<1000;i++){
            out.writeInt(i);
        }
        DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
        for(int i = 0;i<500;i++){
            System.out.println(in.readInt());
        }
    }
}
