package llietketukhacnhautrongFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author suckm
 */
public class WordSet {
    private TreeSet<String> wordSet = new TreeSet<>();
    public WordSet(String s) throws IOException{
        File f = new File(s);
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
            String[] temp = sc.next().toLowerCase().split("\\s+");
            for(String i: temp){
                wordSet.add(i);
            }
        }
    }
    public String word(){
        String res = "";
        for(String i: wordSet){
            res += i + "\n";
        }
        return res;
    }
    
    @Override
    public String toString() {
        return word();
    }
}
