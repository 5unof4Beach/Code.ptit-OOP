package WORDSET;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author suckm
 */
public class HieuHaiFileVanBan1 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}

class WordSet {
    private String dataIn;
    private TreeSet<String> words = new TreeSet<>();

    public WordSet(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        while(sc.hasNextLine()){
            this.dataIn = sc.nextLine().toLowerCase();
            String temp[] = dataIn.toLowerCase().split(" ");
            for(String i:temp){
                words.add(i);
            }
        }
    }
    public TreeSet getWords() {
        return words;
    }
    
    public String union(WordSet s2){
        TreeSet<String> data = s2.getWords();
        TreeSet<String> res = new TreeSet<String>();
        res.addAll(this.words);
        res.addAll(data);
        
        String resStr = "";
        for(String i:res){
            resStr += i + " ";
        }
        return resStr.trim();
    }
    
    public String intersection(WordSet s2){
        TreeSet<String> data = s2.getWords();
        TreeSet<String> res = new TreeSet<String>();
        for(String i:data){
            if(this.words.contains(i)){
                res.add(i);
            }
        }
        
        String resStr = "";
        for(String i:res){
            resStr += i + " ";
        }
        return resStr.trim();
    }
    
    public String difference(WordSet s2){
        TreeSet<String> data = s2.getWords();
        TreeSet<String> res = new TreeSet<String>();
        for(String i:words){
            if(!data.contains(i)){
                res.add(i);
            }
        }
        
        String resStr = "";
        for(String i:res){
            resStr += i + " ";
        }
        return resStr.trim();
    }
}

