/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class NhanVien {
    private String name,gender,addr,taxcode;
    private Date dob,contract_date;
    private int id;
    
    public NhanVien(int id,String name,String gender,String dob,
                    String add,String tax,String contract) throws ParseException
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        Date temp = new SimpleDateFormat("dd/mm/yyyy").parse(dob);
        this.dob = temp;
        this.addr = add;
        this.taxcode = tax;
        temp = new SimpleDateFormat("dd/mm/yyyy").parse(contract);
        this.contract_date = temp;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(String dob) throws ParseException {
        Date temp = new SimpleDateFormat("dd/mm/yyyy").parse(dob);
        this.dob = temp;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public Date getContract_date() {
        return contract_date;
    }

    public void setContract_date(String contract_date) throws ParseException {
        Date temp = new SimpleDateFormat("dd/mm/yyyy").parse(contract_date);
        this.contract_date = temp;
    }
    
    public String toString(){
        //chuan hoa stt
        String ID = "";
        if(this.id < 10){
            ID = "0000" + this.id;
        }
        else
        {
            ID = "000" + this.id;
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String dateOfBirth = formatter.format(dob);
        String contractDate = formatter.format(contract_date);
        return String.format("%s %s %s %s %s %s %s",ID,name,gender,dateOfBirth,addr,taxcode,contractDate);
    }
    
    public void show(){
        System.out.println(toString());
    }
    
}
