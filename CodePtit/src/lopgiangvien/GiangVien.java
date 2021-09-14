/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopgiangvien;

/**
 *
 * @author suckm
 */
public class GiangVien {
    private String ID,fullName,subject,firstName;
    public GiangVien(int id,String fullName,String subject){
        if(id<10) ID = "GV0" + id;
        else ID = "GV" + id;
        this.fullName = fullName;
        String temp[] = subject.split(" ");
        String res = "";
        for(int i=0;i<temp.length;i++){
            res += temp[i].charAt(0);
        }
        this.subject = res.toUpperCase();
    }
    
    public String getFirstName(){
        String temp[] = fullName.split(" ");
        return temp[temp.length-1];
    }

    public String getID() {
        return ID;
    }

    public String getSubject() {
        return subject;
    }

    public String getFullName() {
        return fullName;
    }
    
    
    public void show(){
        System.out.printf("%s %s %s\n",ID,fullName,subject);
    }
}
