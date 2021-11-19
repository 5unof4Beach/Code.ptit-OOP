/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSMonHoc;

/**
 *
 * @author Viet Anh
 */
public class PointTable{
    private Student st;
    private Subject sub;
    private double point;

    public PointTable(Student st, Subject sub, double point) {
        this.st = st;
        this.sub = sub;
        this.point = point;
    }
    
    public String getStuID(){
        return st.getid();
    }
    
    public String getStuClass(){
        return st.getCl();
    }

    public double getpoint() {
        return point;
    }
    
    public String getSubID(){
        return sub.getId();
    }
    
    public String getName(){
        return sub.getName();
    }
    
    @Override
    public String toString() {
        if(point - (int)point == 0){
            return st.getid() + " " +  st.getname() + " " + st.getCl() + " " + (int)point;
        }else{
            return st.getid()+ " " +  st.getname()+ " " + st.getCl() + " " + point;
        }
    }
}
