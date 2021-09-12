/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopthoigian;

/**
 *
 * @author suckm
 */
public class Hour {
    private int hour,min,sec,sum;
    public Hour(int h,int m,int s){
        this.hour = h;
        this.min = m;
        this.sec = s;
    }

    public int getSum() {
        return hour*60*60 + min*60 + sec;
    }
    
    public void show(){
        System.out.println(hour + " " + min + " " + sec);
    }
}
