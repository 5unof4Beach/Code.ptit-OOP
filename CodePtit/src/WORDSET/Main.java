package WORDSET;

import java.util.*;

/**
 *
 * @author suckm
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}


class WordSet {
    private String dataIn;
    private TreeSet<String> words = new TreeSet<>();

    public WordSet(String dataIn) {
        this.dataIn = dataIn.toLowerCase();
        String temp[] = dataIn.toLowerCase().split(" ");
        for(String i:temp){
            words.add(i);
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
}
