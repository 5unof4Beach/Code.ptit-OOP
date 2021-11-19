package Buoi4;

import java.io.*;
import java.util.*;

/**
 *
 * @author suckm
 */
public class LietKeTu {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("NHIPHAN.in");
        ObjectInputStream ois = new ObjectInputStream(f);
        ArrayList<String> bin = (ArrayList<String>) ois.readObject();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> vanBan = new ArrayList<>();
        ArrayList<String> vanBanBin = new ArrayList<>();
        
        for(String j:bin){
            String[] words = j.trim().toLowerCase().split("\\s+");
            for(String i:words){
                    vanBanBin.add(i);
            }
        }
        
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().trim().toLowerCase().split("\\s+");
            for(String i:words){
                if(!vanBan.contains(i)){
                    if(vanBanBin.contains(i)){
                        System.out.println(i);
                    }
                    vanBan.add(i);
                }
            }
        }
        
    }
}
