package codeptit;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            long n = sc.nextLong();
            sc.nextLine();
            long temp_long = (long)Math.sqrt(n);
            double temp_dou = Math.sqrt(n);
            if(temp_long == temp_dou){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
