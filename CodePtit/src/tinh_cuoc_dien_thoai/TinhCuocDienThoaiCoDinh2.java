package tinh_cuoc_dien_thoai;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class TinhCuocDienThoaiCoDinh2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Vector<Call> calls = new Vector<>();
        Vector<City> cities = new Vector<>();
        while(t-->0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            City c = new City(code, name, price);
            cities.add(c);
        }
        
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String input = sc.nextLine();
            Call ca = new Call(input);
            calls.add(ca);
        }
        
        for(Call i:calls){
            for(City j:cities){
                if(i.getCityCode().equals(j.getCode())){
                    i.setCity(j);
                }
            }
            i.calculateFee();
        }
        calls.sort((i1,i2) -> Long.compare(i2.getTotalFee(), i1.getTotalFee()));
        for(Call i:calls){
            i.show();
        }
    }
}
