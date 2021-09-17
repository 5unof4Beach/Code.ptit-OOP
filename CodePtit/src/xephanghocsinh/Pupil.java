package xephanghocsinh;

public class Pupil {
    private double avg;
    private String name,ID;
    private int rank;
    
    public Pupil(int id,String name,Double avg){
        if(id<10) ID = "HS0" + id;
        else ID = "HS" + id;
        this.name = name;
        this.avg = avg;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public double getAvg(){
        return avg;
    }
    
    public String getSort(){
        if(avg >= 9) return "Gioi";
        else if(avg >= 7) return "Kha";
        else if(avg >= 5) return "Trung Binh";
        else return "Yeu";
    }

    
    public void show(){
        System.out.printf("%s %s %.1f %s %d\n",ID,name,avg,getSort(),rank);
    }
    
}


