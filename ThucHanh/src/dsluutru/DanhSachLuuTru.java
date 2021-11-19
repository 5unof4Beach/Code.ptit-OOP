package dsluutru;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<Customer> ds = new ArrayList<>();
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=n; i++){
            String name = sc.nextLine();
            String room = sc.nextLine();
            String dayIn = sc.nextLine();
            String dayOut = sc.nextLine();
            Customer c = new Customer(i, name, room, dayIn, dayOut);
            ds.add(c);
        }
        
        ds.sort((i1,i2) -> Long.compare(i2.getDaysStay(), i1.getDaysStay()));
        
        for(Customer i:ds){
            i.show2();
        }
    }
}

class Customer {
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
//        calculateRoomFee();
        System.out.printf("%s %s %s %d %.2f\n", id, name, room, daysStay, totalFee);
    }
    
    public void show2(){
//        calculateRoomFee();
        System.out.printf("%s %s %s %d\n", id, name, room, daysStay);
    }
}


class Room {
    String name, infos, roomType;
    public float dailyFee, serviceFee;

    public Room(String info) {
        this.infos = info;
        String[] infos = info.split(" ");
        this.name = infos[1];
        this.roomType = infos[0];
        dailyFee = Float.parseFloat(infos[2]);
        serviceFee = Float.parseFloat(infos[3]);
//        System.out.println(infos[2]);
//        System.out.println(infos[3]);
    }

    public String getName() {
        return name;
    }
    
    public float getDailyFee(){
        return dailyFee;
    }
    
    public float getServiceFee(){
        return dailyFee * serviceFee;
    }
    
    public String getRoomType() {
        return roomType;
    }
    
}
