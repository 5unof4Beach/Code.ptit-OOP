package dsluutru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class Customer {
    private String id, name, room;
    private Date dayIn, dayOut;
    private Long daysStay;
    private Room r;
    private float totalFee;

    public Customer(int i, String name, String room, String dayIn, String dayOut) throws ParseException {
        this.id = String.format("KH%02d", i);
        this.name = name;
        this.room = room;
        this.dayIn = new SimpleDateFormat("dd/MM/yyyy").parse(dayIn);
        this.dayOut = new SimpleDateFormat("dd/MM/yyyy").parse(dayOut);
        setDaysStay();
    }
    
    private void setDaysStay() {
        long timeStayInSeconds = (dayOut.getTime() - dayIn.getTime())/1000;
        daysStay = timeStayInSeconds/(24*3600) /*+ 1*/;
    }

    public Long getDaysStay() {
        return daysStay;
    }

    public void setRoom(Room r) {
        this.r = r;
    }
    
    public double discountPer(){
        if(daysStay>=30) return 0.06;
        else if(daysStay >= 20) return 0.04;
        else if(daysStay >= 10) return 0.02;
        return 0;
    }
    
    private void calculateRoomFee(){
        long temp = 0;
        if(daysStay == 0){
            temp += 1;
        }
        else{
            temp = daysStay;
        }
        totalFee = temp * (r.getDailyFee() + r.getServiceFee());
        totalFee = (float) (totalFee - totalFee * discountPer());
        totalFee = (float)Math.round(totalFee * 100)/100;
    }
    
    public void show(){
        calculateRoomFee();
        System.out.printf("%s %s %s %d %.2f\n", id, name, room, daysStay, totalFee);
    }
    
    public void show2(){
        calculateRoomFee();
        System.out.printf("%s %s %s %d\n", id, name, room, daysStay);
    }
}
