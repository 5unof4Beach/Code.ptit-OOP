/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopsinhvien;

/**
 *
 * @author suckm
 */
public class SinhVien {
    private String name,lop,dob,stuID;
    private float gpa;
    
    public SinhVien(){
        this.name = "";
        this.lop = "";
        this.dob = "";
        this.gpa = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    
    
    public void setStuID(String stuID) {
        this.stuID = stuID;
    }
    
    public void printstuID(){
        System.out.print(this.stuID + " ");
    }
    
    public void printName(){
        System.out.print(this.name + " ");
    }
    
    public void printLop(){
        System.out.print(this.lop + " ");
    }
    
    public void printGPA(){
        System.out.printf("%.2f",gpa);
    }
    
    public void printDOB(){
        String temp[] = dob.split("/");
        String res = "";
        if(temp[0].length() == 2){
            res += temp[0] +'/';
        }
        else{
            res += '0' + temp[0] +'/';
        }
        
        if(temp[1].length() == 2){
            res += temp[1] +'/';
        }
        else{
            res += '0' + temp[1] +'/';
        }
        res += temp[2];
        System.out.print(res.toString() + " ");
        
    }
}
