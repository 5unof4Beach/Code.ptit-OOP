package codeptit;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> full = new Vector<>();
        Vector<Integer> missing = new Vector<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<n;i++){
            missing.add(Integer.parseInt(sc.next()));
        }
        for(int i=1;i<=missing.lastElement().intValue();i++){
            full.add(i);
        }
        full.removeAll(missing);
        if(full.size() == 0){
            System.out.println("Excellent!");
        }
        else
            for(Integer i:full){
                System.out.println(i);
            }
    }
}
