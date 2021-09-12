package lopthoigian;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author suckm
 */
public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Hour> res = new Vector<Hour>();
        for(int i=0;i<n;i++){
            int hour = sc.nextInt();
            int min =  sc.nextInt();
            int sec =  sc.nextInt();
            Hour hr = new Hour(hour,min,sec);
            res.add(hr);
        }
        Collections.sort(res,new hourSort());
        for(Hour element : res){
            element.show();
        }
    }
}

class hourSort implements Comparator<Hour>{
    public int compare(Hour h1,Hour h2){
        if(h1.getSum() > h2.getSum()){
            return 1;
        }
        else
            return -1;
    }
}