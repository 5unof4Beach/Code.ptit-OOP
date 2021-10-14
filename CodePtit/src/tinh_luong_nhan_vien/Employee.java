package tinh_luong_nhan_vien;

/**
 *
 * @author suckm
 */
public class Employee {
    private String fullID,name,officeID,group,officeName;
    private int baseSal,days,multiplier,years,totalSal;

    public Employee(String id, String name, int baseSal, int days) {
        this.fullID = id;
        this.name = name;
        this.baseSal = baseSal;
        this.days = days;
        setAll();
        setMultiplier();
        setSal();
    }
    private void setAll(){
        group = fullID.substring(0,1);
        officeID = fullID.substring(3);
        years = Integer.parseInt(fullID.substring(1,3));
    }
    private void setMultiplier(){
        switch(group){
            case "A":
                if(years>=16){
                    multiplier = 20;
                }
                else if(years >=9){
                    multiplier = 14;
                }
                else if(years >=4){
                    multiplier = 12;
                }
                else{
                    multiplier = 10;
                }
                break;
            case "B":
                if(years>=16){
                    multiplier = 16;
                }
                else if(years >=9){
                    multiplier = 13;
                }
                else if(years >=4){
                    multiplier = 11;
                }
                else{
                    multiplier = 10;
                }
                break;
            case "C":
                if(years>=16){
                    multiplier = 14;
                }
                else if(years >=9){
                    multiplier = 12;
                }
                else if(years >=4){
                    multiplier = 10;
                }
                else{
                    multiplier = 9;
                }
                break;
            default:
                if(years>=16){
                    multiplier = 13;
                }
                else if(years >=9){
                    multiplier = 11;
                }
                else if(years >=4){
                    multiplier = 9;
                }
                else{
                    multiplier = 8;
                }
                break;
        }
    }
    
    private void setSal(){
        totalSal = 1000 * multiplier * baseSal * days;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeID() {
        return officeID;
    }
    public void show(){
        System.out.printf("%s %s %s %d\n",fullID,name,officeName,totalSal);
    }
    public void show2(){
        System.out.printf("%s %s %d\n",fullID,name,totalSal);
    }
}
