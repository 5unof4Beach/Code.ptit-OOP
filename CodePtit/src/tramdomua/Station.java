package tramdomua;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author suckm
 */
public class Station {
    private String ID,name;
    private long amount,duration; 
    private Date timeStart,timeEnd;
    public Station(String name,String start,String end,long amount) throws ParseException{
        this.name = name;
        this.timeStart = new SimpleDateFormat("hh:mm").parse(start);
        this.timeEnd = new SimpleDateFormat("hh:mm").parse(end);
        this.amount = amount;
        setDuration();
        
    }
    private void setDuration(){
        long temp = (timeEnd.getTime() - timeStart.getTime())/1000;
        duration = temp/60;
    }
    public String getName() {
        return name;
    }
    public long getAmount(){
        return amount;
    }

    public long getDuration() {
        return duration;
    }
    
    public void show(){
        System.out.println(name);
    }
}
