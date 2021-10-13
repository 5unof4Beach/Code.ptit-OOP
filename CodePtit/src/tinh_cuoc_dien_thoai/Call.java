package tinh_cuoc_dien_thoai;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class Call {
    private String phone_number,cityCode,typeOfCall;
    private Date timeStart,timeEnd;
    private long totalMins,totalFee;
    private City city;

    public Call(String input) throws ParseException {
        String temp[] = input.split(" ");
        this.phone_number = temp[0];
        this.timeStart = new SimpleDateFormat("HH:mm").parse(temp[1]);
        this.timeEnd = new SimpleDateFormat("HH:mm").parse(temp[2]);
        setTotalMins();
        setCityCode();
    }

    private void setTotalMins() {
        totalMins = timeEnd.getTime()- timeStart.getTime();
        totalMins /= 1000*60;
//        totalMins = timeStart.getMinutes()- timeEnd.getMinutes();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode() {
        this.cityCode = phone_number.substring(1,3);
    }

    public void setCity(City city) {
        this.city = city;
    }
    public void calculateFee(){
        boolean isInternalCall = true;
        int fee = 800;
        if(phone_number.charAt(0) == '0'){
            isInternalCall = false;
        }
        if( !isInternalCall ){
            fee = city.getPrice();
            typeOfCall = city.getName();
        }
        else{
            totalMins = (long) Math.ceil(totalMins/3.0);
            typeOfCall = "Noi mang";
        }
        totalFee = totalMins*fee;
    }

    public long getTotalFee() {
        return totalFee;
    }
    
    public void show(){
//        calculateFee();
        System.out.printf("%s %s %d %d\n",phone_number,
                                            typeOfCall,
                                            totalMins,
                                            totalFee,
                                            timeStart.toString(),
                                            timeEnd.toString());
    }
}
