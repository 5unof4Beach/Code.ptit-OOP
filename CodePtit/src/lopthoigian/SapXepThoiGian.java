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
        res.sort((i1,i2)->Integer.compare(i1.getSum(), i2.getSum()));
        for(Hour element : res){
            element.show();
        }
    }
}

