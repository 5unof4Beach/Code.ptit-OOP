/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopdoanhnghiep;

/**
 *
 * @author suckm
 */
public class DoanhNghiep {
    private String codeName,fullName;
    private int amount;
    public DoanhNghiep(String code,String name,int n){
        codeName = code;
        fullName = name;
        amount = n;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void show(){
        System.out.printf("%s %s %d\n",codeName,fullName,amount);
    }
}
