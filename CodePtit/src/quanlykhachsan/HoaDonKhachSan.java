package quanlykhachsan;
import java.text.ParseException;
import java.util.*;
public class HoaDonKhachSan {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<HotelCustomer> res = new Vector<HotelCustomer>() ;
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String room = sc.nextLine();
            String dayIn = sc.nextLine();
            String dayOut = sc.nextLine();
            Long exceed = sc.nextLong();
            sc.nextLine();
            HotelCustomer ho = new HotelCustomer(i, name, room, dayIn, dayOut, exceed);
            res.add(ho);
        }
        res.sort((i1,i2)->Long.compare(i2.getTotalPay(), i1.getTotalPay()));
        for(HotelCustomer i:res){
            i.show();
        }
    }
}
