package codeptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = Integer.parseInt(sc.nextLine());
            Vector<Integer> numbers = new Vector<>();
            for(int i = 0; i<n; i++){
                numbers.add(sc.nextInt());
            }
            sc.nextLine();
            numbers.add(-1);
            for(int i = 0;i<numbers.size()-1;i++){
                int tmp = numbers.get(i);
                for(int j=i+1;j<numbers.size();j++){
                    if(numbers.get(j) == -1){
                        System.out.print(-1 + " ");
                    }
                    else if(numbers.get(j) > tmp){
                        System.out.print(numbers.get(j) + " ");
                        break;
                    }
                }
            }
            System.out.println("");
        }
    }
}
