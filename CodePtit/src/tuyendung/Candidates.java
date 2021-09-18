package tuyendung;

public class Candidates {
    private String ID,name;
    private double point,theoryPoint,practicePoint,avg;
    public Candidates(int id,String name,Double theory,Double practice){
        if(id<10) ID = "TS0" + id;
        else ID = "TS" + id;
        this.name = name;
        this.theoryPoint = standardize(theory);
        this.practicePoint = standardize(practice);
        this.avg = (theoryPoint + practicePoint)/2.0;
        
    }
    public double standardize(double point){
        if( point > 10 ){
            return point/10.0;
        }
        return point;
    }
    
    private String Ranking(){
        if(avg>9.5) return "XUAT SAC";
        else if(avg>=8.0) return "DAT";
        else if(avg>=5.0) return  "CAN NHAC";
        else return "TRUOT";
    }
    
    public double getAvg() {
        return avg;
    }
    
    public void show(){
        System.out.printf("%s %s %.2f %s\n",ID,name,avg,Ranking());
    }
}
