package diem_danh_J05074;

public class Student {
    private String id,name,clss,attendence,note="";
    private int point=10;

    public Student(String id, String name, String clss) {
        this.id = id;
        this.name = name;
        this.clss = clss;
    }

    public void setAttendence(String attendence) {
        this.attendence = attendence;
    }

    public String getId() {
        return id;
    }

    public String getClss() {
        return clss;
    }
    
    public void pointAndNote(){
        for(int i=0;i<attendence.length();i++){
            char temp = attendence.charAt(i);
            if(temp == 'v'){
                point -= 2;
            }
            else if(temp == 'm'){
                point--;
            }
        }
        if(point<=0){
            point = 0;
            note = "KDDK";
        }
    }
    public void show(){
        pointAndNote();
        System.out.printf("%s %s %s %d %s\n",id,name,clss,point,note);
    }
}
