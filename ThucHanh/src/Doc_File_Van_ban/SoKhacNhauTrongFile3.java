package Doc_File_Van_ban;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author suckm
 */
public class SoKhacNhauTrongFile3 {
     public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        FileOutputStream f1  = new FileOutputStream("DATA.in");
//        ObjectOutputStream dout = new ObjectOutputStream(f1);
//        ArrayList<Integer> temp = new ArrayList<>();
//        temp.add(10);
//        temp.add(24);
//        temp.add(23);
//        temp.add(25);
//        temp.add(25);
//        temp.add(25);
//        temp.add(25);
//        dout.writeObject(temp);
        
        FileInputStream f2 = new FileInputStream("DATA.in");
        ObjectInputStream din = new ObjectInputStream(f2);
        TreeMap<Integer,Integer> numbers = new TreeMap<>();
        ArrayList<Integer> arr = (ArrayList<Integer>) din.readObject();
        
        for(Integer i:arr){
            if(!numbers.containsKey(i)){
                numbers.put(i, 1);
            }
            else{
                numbers.put(i, numbers.get(i)+1);
            }
        }
        for(Integer i:numbers.keySet()){
            System.out.println(i + " " + numbers.get(i));
        }
    }
}
