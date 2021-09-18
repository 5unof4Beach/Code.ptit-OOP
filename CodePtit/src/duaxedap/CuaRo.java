package duaxedap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuaRo {
    private String ID,name,unit,speed;
    private Date finishTime;
    private long speedInInt;
    
    public CuaRo(String name,String unit,String finish) throws ParseException{
        this.name = name;
        this.unit = unit;
        this.finishTime = new SimpleDateFormat("H:mm").parse(finish);
        this.ID = "";
        setID();
        setSpeed();
    }

    public long getSpeedInInt() {
        return speedInInt;
    }

    private void setID() {
        String temp[] = unit.split(" ");
        for(String i:temp){
            this.ID += i.substring(0,1);
        }
        String temp2[] = name.split(" ");
        for(String i:temp2){
            this.ID += i.substring(0,1);
        }
    }

    private void setSpeed() {
        int hour = finishTime.getHours() - 6;
        int min = finishTime.getMinutes();
        Double total = hour + min/60.0;
        speedInInt = Math.round(120/total);
        this.speed = speedInInt +" Km/h";
    }
    
    public void show(){
        System.out.printf("%s %s %s %s\n",ID,name,unit,speed);
    }
    
}
