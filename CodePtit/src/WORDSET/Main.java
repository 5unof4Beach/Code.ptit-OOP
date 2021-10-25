package WORDSET;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

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
    private Vector<String> words = new Vector<>();

    public WordSet(String dataIn) {
        this.dataIn = dataIn.toLowerCase();
        String temp[] = dataIn.toLowerCase().split("\\s+");
        for(String i:temp){
            if(!i.equals(""))
               words.add(i);
        }
    }
    public Vector getWords() {
        return words;
    }
    
    public String union(WordSet s2){
        Vector<String> data = s2.getWords();
        Vector<String> res = new Vector<String>();
        res.addAll(this.words);
        for(String i:data){
            if(!res.contains(i)){
                res.add(i);
            }
        }
        Collections.sort(res);
        String resStr = "";
        for(String i:res){
            resStr += i + " ";
        }
        return resStr;
    }
    
    public String intersection(WordSet s2){
        Vector<String> data = s2.getWords();
        Vector<String> res = new Vector<String>();
        for(String i:data){
            if(this.words.contains(i)){
                res.add(i);
            }
        }
        
        Collections.sort(res);
        String resStr = "";
        for(String i:res){
            resStr += i + " ";
        }
        return resStr;
    }
}
