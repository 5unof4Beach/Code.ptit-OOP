/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopthisinh;

/**
 *
 * @author suckm
 */
public class ThiSinh {
    private String hvt,dob;
    private double m1,m2,m3,sum = 0;
    public ThiSinh(String name,String date,double m1,double m2,double m3){
        this.hvt = name;
        this.dob = date;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    
    public void PrintSum(){
        System.out.printf("%.1f",m1+m2+m3);
        System.out.println("");
    }
    public void printName(){
        System.out.print(hvt + " ");
    }
    public void printDOB(){
        int temp = 0;
        for(int i=0;i<dob.length();i++){
            if(dob.charAt(i) == '/') break;
            temp++;
        }
        if(temp==2)
            System.out.print(dob + " ");
        else 
            System.out.print("0" + dob + " ");
    }
}
