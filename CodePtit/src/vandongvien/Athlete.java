package vandongvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Athlete {
    private String ID,name;
    private Date dob,start,finish,timeComplete,
            advantageTimeFormat,timeCompleteWithAdvantage;
    private int age,advantage,rank;
    private long timeCompleteInSeconds;
    
    public Athlete(int id,String name,String dob,String start,String finish) throws ParseException{
        if(id<10) ID = "VDV0" + id;
        else ID = "VDV" + id;
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.start = new SimpleDateFormat("hh:mm:ss").parse(start);
        this.finish = new SimpleDateFormat("hh:mm:ss").parse(finish);
        setAge();
        setAdvantage();
        setTimeComplete();
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setTimeComplete() throws ParseException {
        long temp = (finish.getTime()-start.getTime())/1000;
        long temp2 = temp - advantage;
        timeCompleteInSeconds = temp2;
        long hour = (temp/3600);
        temp %= 3600;
        long min = (temp/60);
        long sec = (temp%60);
        String str1 = hour + ":" + min + ":" +sec;
        timeComplete = new SimpleDateFormat("hh:mm:ss").parse(str1);
        long hour2 = (temp2/3600);
        temp2 %= 3600;
        long min2 = (temp2/60);
        long sec2 = (temp2%60);
        String str2 = hour2 + ":" + min2 + ":" +sec2;
        timeCompleteWithAdvantage = new SimpleDateFormat("hh:mm:ss").parse(str2);
        
    }
    
    public void setAge(){
        int now = Calendar.getInstance().get(Calendar.YEAR);
        age = now - dob.getYear()-1900;
    }

    public void setAdvantage() throws ParseException {
        if(age>32) advantage = 3;
        else if(age>=25) advantage = 2;
        else if(age>=18) advantage = 1;
        else advantage = 0;
        advantageTimeFormat = new SimpleDateFormat("hh:mm:ss").parse("0:0:"+advantage);
    }

    public long getTimeCompleteInSeconds() {
        return timeCompleteInSeconds;
    }
    
    public void show(){
        SimpleDateFormat HourFormatter = new SimpleDateFormat("HH:mm:ss");
        System.out.printf("%s %s %s %s %s %d \n",ID,name,
                        HourFormatter.format(timeComplete),
                        HourFormatter.format(advantageTimeFormat),
                        HourFormatter.format(timeCompleteWithAdvantage),
                        rank);
    }
    
}
