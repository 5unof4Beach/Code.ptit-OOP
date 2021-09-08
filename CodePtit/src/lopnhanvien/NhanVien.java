/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopnhanvien;

/**
 *
 * @author suckm
 */
public class NhanVien {
    private String id,name,gender,dob,addr,taxcode,contract_date,stt;

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }
    
    

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
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
        return res.toString();
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public String getContract_date() {
        String temp[] = contract_date.split("/");
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
        return res.toString();
    }

    public void setContract_date(String contract_date) {
        this.contract_date = contract_date;
    }
    
}
