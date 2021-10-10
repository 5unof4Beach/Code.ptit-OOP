package codeptit;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class InMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            int mat[][] = new int[n][n];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            sc.nextLine();
            for(int i = 0;i<n;i++){
                if(i % 2 == 0)
                    for(int j = 0;j<n;j++){
                        System.out.print(mat[i][j] + " ");
                    }
                else
                    for(int j = n-1;j>=0;j--){
                        System.out.print(mat[i][j] + " ");
                    }
            }
            System.out.println("");
        }
            
    }
}
