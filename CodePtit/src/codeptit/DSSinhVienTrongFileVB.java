package codeptit;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class DSSinhVienTrongFileVB {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            int l=4;
            String msv = String.format("B20DCCN%03d", i);
            System.out.print(msv + " ");
            while(l-->0){
                System.out.print(sc.nextLine() + " ");
            }
            System.out.println("");
        }
    }
}
