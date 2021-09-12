/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochoigame;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class Player {
    private String id,name,timeIn,timeOut;
    private long timePlayed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
    public void setTimePlay() throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("hh:mm"); 
        Date in = df.parse(timeIn);
        Date out = df.parse(timeOut);
        this.timePlayed = out.getTime() - in.getTime();//kết quả bằng mili giây
//        
    }

    public long getTimePlayed(){
        return timePlayed;
    }
    
    
    public void show() throws ParseException{
        long temp = getTimePlayed();
        long minTotal = temp / (60 * 1000);
        long hour = minTotal/60;
        long min = minTotal % 60;
        System.out.printf("%s %s %d gio %d phut\n",id,name,hour,min);
    }
}
