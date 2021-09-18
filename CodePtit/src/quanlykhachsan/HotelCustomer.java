package quanlykhachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class HotelCustomer {
    private String ID,name,floor,room;
    private Date dayReceive,dayReturn;
    private long exceed,price,daysStay,totalPay;
    public HotelCustomer(int id,String name,String room,String Dayreceive,String Dayreturn,long exceed) throws ParseException{
        if(id<10) ID = "KH0" + id;
        else ID = "KH" + id;
        this.name = name;
        this.room = room;
        this.exceed = exceed;
        dayReceive = new SimpleDateFormat("dd/MM/yyyy").parse(Dayreceive);
        dayReturn = new SimpleDateFormat("dd/MM/yyyy").parse(Dayreturn);
        setFloor(room);
        setPrice();
        setDaysStay();
        setTotalPay();
    }

    public void setFloor(String room) {
        this.floor = room.substring(0,1);
    }

    public void setPrice() {
        if(floor.equals("1")) price = 25;
        else if(floor.equals("2")) price = 34;
        else if(floor.equals("3")) price = 50;
        else price = 80;
    }

    public void setDaysStay() {
        long timeStayInSeconds = (dayReturn.getTime() - dayReceive.getTime())/1000;
        daysStay = timeStayInSeconds/(24*3600) + 1;
    }

    public void setTotalPay() {
        this.totalPay = daysStay * price + exceed;
    }

    public long getTotalPay() {
        return totalPay;
    }
    
    public void show(){
        System.out.printf("%s %s %s %d %d\n",ID,name,room,daysStay,totalPay);
    }
    
}
