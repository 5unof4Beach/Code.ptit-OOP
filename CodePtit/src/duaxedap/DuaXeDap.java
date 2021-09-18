package duaxedap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DuaXeDap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Vector<CuaRo> res = new Vector<CuaRo>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            String finish = sc.nextLine();
            CuaRo cu = new CuaRo(name,unit,finish);
            res.add(cu);
        }
        res.sort((i1,i2)->Double.compare(i1.getTimeToFinish(), i2.getTimeToFinish()));
        for(CuaRo i:res){
            i.show();
        }
    }
}


class CuaRo {
    private String ID,name,unit,speed;
    private Date finishTime;
    private long speedInInt;
    private double timeToFinish;
    
    public CuaRo(String name,String unit,String finish) throws ParseException{
        this.name = name;
        this.unit = unit;
        this.finishTime = new SimpleDateFormat("H:mm").parse(finish);
        this.ID = "";
        setID();
        setSpeed();
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
        timeToFinish = hour + min/60.0;
        speedInInt = Math.round(120/timeToFinish);
        this.speed = speedInInt +" Km/h";
    }

    public double getTimeToFinish() {
        return timeToFinish;
    }
    
    public void show(){
        System.out.printf("%s %s %s %s\n",ID,name,unit,speed);
    }
    
}
