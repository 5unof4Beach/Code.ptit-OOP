package nhan_vien_van_phong_J05065;

public class Employee {
    private String fullID,name,pos,salaryRank,number;

    public Employee(String fullID, String name) {
        this.fullID = fullID;
        this.name = name;
        setPos();
        setNumber();
        setSalaryRank();
    }

    public void setPos() {
        this.pos = fullID.substring(0,2);
    }
    
    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setSalaryRank() {
        this.salaryRank = fullID.substring(2,4);
    }

    public void setNumber() {
        this.number = fullID.substring(4);
    }

    public String getPos() {
        return pos;
    }

    public String getSalaryRank() {
        return salaryRank;
    }
    public String getNameInLower(){
        return name.toLowerCase();
//        return name;
    }
    public String getNumber() {
        return number;
    }
    public void show(){
        System.out.printf("%s %s %s %s\n",name,pos,number,salaryRank);
    }
}
