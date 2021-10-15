package tinh_gio_chuan_giang_vien;

import java.util.Vector;

/**
 *
 * @author suckm
 */
public class Lecturer {
    private String id,name;
    private float totalTime;
    public Lecturer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void addTime(float t){
        totalTime += t;
    }
    public void show(){
        System.out.printf("%s %.2f\n",name,totalTime);
    }
    public void showTotalTime(){
        System.out.printf("Tong: %.2f\n",totalTime);
    }
}
