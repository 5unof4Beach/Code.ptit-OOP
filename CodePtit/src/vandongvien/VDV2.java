package vandongvien;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author suckm
 */
public class VDV2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            String start = sc.nextLine();
            String finish = sc.nextLine();
            Athlete at = new Athlete(i,name,dob,start,finish);
            sol.addObject(at);
        }
        sol.ranking();
        sol.sortByRank();
        sol.show();
    }
}
