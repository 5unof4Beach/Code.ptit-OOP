package PS;
import java.util.*;
/**
 *
 * @author suckm
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            int Afirst = sc.nextInt();
            int Asec = sc.nextInt();
            int Bfirst = sc.nextInt();
            int Bsec = sc.nextInt();
            sc.nextLine();
            PhanSo A = new PhanSo(Afirst,Asec);
            PhanSo B = new PhanSo(Bfirst,Bsec);
            PhanSo C = new PhanSo(0,1);
            PhanSo D = new PhanSo(0,1);
            C = C.pow(C.sum(A,B));
            C.rutGon();
            C.show();
            D = A.multiply(B.multiply(C));
            D.rutGon();
            D.show();
            System.out.println("");
        }
    }
}
