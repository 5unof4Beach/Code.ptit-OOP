package TinhTienPhongFileIO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class Customer {
    private String name, room, id;
    private Date dayIn, dayOut;
    private long extras, dayStay, totalPay;

    public Customer(int i, String name, String room, String dayIn, String dayOut, long extras) throws ParseException {
        this.id = String.format("KH%02d", i);
        this.name = stdize(name);
        this.room = room;
        this.dayIn = new SimpleDateFormat("dd/MM/yyyy").parse(dayIn);
        this.dayOut = new SimpleDateFormat("dd/MM/yyyy").parse(dayOut);;
        this.extras = extras;
        setDayStay();
        SetTotalPay();
    }
    
    private void setDayStay(){
        long time = (dayOut.getTime() - dayIn.getTime())/(3600*1000);
        dayStay = (time/24) + 1;
    }
    
    private void SetTotalPay(){
        int price = 0;
        char floor = room.charAt(0);
        if(floor == '1') price = 25;
        else if(floor == '2') price = 34;
        else if(floor == '3') price = 30;
        else price = 80;
        
        totalPay = dayStay * price + extras;
    }
    
    private String stdize(String name){
        String[] temp = name.toLowerCase().split("\\s+");
        String res = "";
        for(String i:temp){
            res += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }

    public long getTotalPay() {
        return totalPay;
    }
    
    public void show(){
        System.out.printf("%s %s %s %d %d\n", id, name, room, dayStay, totalPay);
    }
}
