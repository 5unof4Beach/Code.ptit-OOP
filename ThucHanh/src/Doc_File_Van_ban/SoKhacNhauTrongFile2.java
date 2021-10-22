package Doc_File_Van_ban;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author suckm
 */
public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        FileOutputStream f1  = new FileOutputStream("DATA.IN");
//        DataOutputStream dout = new DataOutputStream(f1);
//        
//        for(int i = 1;i<100;i++){
//            dout.writeInt(i);
//        }
        
        FileInputStream f2 = new FileInputStream("DATA.IN");
        DataInputStream din = new DataInputStream(f2);
        TreeMap<Integer,Integer> numbers = new TreeMap<>();
        for(int i=1;i<=100000 ;i++){
            int temp = din.readInt();
            if(!numbers.containsKey(temp)){
                numbers.put(temp,1);
            }
            else{
                numbers.put(temp, numbers.get(temp)+1);
            }
        }
        for(Integer i:numbers.keySet()){
            System.out.println(i + " " + numbers.get(i));
        }
    }
}
