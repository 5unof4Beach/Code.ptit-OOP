package intset_J04021;

import java.util.TreeSet;

/**
 *
 * @author suckm
 */
public class IntSet {
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
    
    @Override
    public String toString(){
        String res = "";
        for(Integer i:treeSet){
            res += i.intValue() + " ";
        }
        return res;
    }
}
