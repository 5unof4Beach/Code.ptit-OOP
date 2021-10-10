package lopthoigian;

/**
 *
 * @author suckm
 */
import java.util.*;
class ThoiGian {

    private int second;
    private final String time;

    public ThoiGian(String time) {
        this.time = time;
        FormatTIME();
    }


    public String getTime() {
        return time;
    }

    public int getSecond() {
        return second;
    }
    

    public int FormatTIME() {
        String[] tmp = time.split("\\s+");
        second += Integer.valueOf(tmp[0]) * 60 * 60 + Integer.valueOf(tmp[1]) * 60 + Integer.valueOf(tmp[2]);
        return second;
    }
}

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThoiGian> ArrOb = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String Time = sc.nextLine();
            ThoiGian tg = new ThoiGian(Time);
            ArrOb.add(tg);
        }
        Collections.sort(ArrOb, new timeComparator());
       for(ThoiGian i : ArrOb){
           System.out.println(i.getTime());
           System.out.println(i.FormatTIME());
       }

    }
}
// ???????? tại sao khi dùng lớp này FormatTIME bị thay đổi
class timeComparator implements Comparator<ThoiGian>{
    @Override
    public int compare(ThoiGian s1, ThoiGian s2) {
        return Integer.compare(s1.getSecond(),s2.getSecond());
    }

}
