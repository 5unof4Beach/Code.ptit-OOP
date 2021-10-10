package codeptit;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        sc.nextLine();
        int mat[][] = new int[n][3];
        for(int i = 0;i<n;i++){
            int one = 0;
            for(int j = 0;j<3;j++){
                mat[i][j] = sc.nextInt();
                if(mat[i][j] == 1){
                    one++;
                }
            }
            if(one > 3 - one){
                res++;
            }
        }
        System.out.println(res);
    }
}
