package intset_J04021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author suckm
 */
public class LopIntset2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}

class IntSet {
    private int set[];
    private TreeSet<Integer> treeSet;

    public IntSet(int[] set) {
        this.set = set;
    }
    
    public IntSet(TreeSet<Integer> set) {
        treeSet = set;
    }
    
    public int[] getSet() {
        return set;
    }
    
    public IntSet union(IntSet set2){
        TreeSet<Integer> res = new TreeSet<>();
        for(int i=0;i<set.length;i++){
            if(!res.contains(set[i])){
                res.add(set[i]);
            }
        }
        for(int i=0;i<set2.getSet().length;i++){
            if(!res.contains(set2.getSet()[i])){
                res.add(set2.getSet()[i]);
            }
        }
        return new IntSet(res);
    }
    public IntSet intersection(IntSet set2){
        TreeSet<Integer> res = new TreeSet<>();
        TreeSet<Integer> temp = new TreeSet<>();
        for(int i=0;i<set.length;i++){
            res.add(set[i]);
        }
        for(int i=0;i<set2.getSet().length;i++){
            if(res.contains(set2.getSet()[i])){
                temp.add(set2.getSet()[i]);
            }
        }
        return new IntSet(temp);
    }
    
    @Override
    public String toString(){
        String res = "";
        for(Integer i:treeSet){
            res += i.intValue() + " ";
        }
        return res;
    }
}
