package lopchucvu;

/**
 *
 * @author suckm
 */
public class Employee {
    private String ID,name,positionID;
    private long workDays,salary,monthlySalary,allowance,tempEarn,prize,finalPay;
    
    public Employee(int ID,String name,String pos,int salary,int workDays){
        if(ID<10) this.ID = "NV0" + ID;
        else this.ID = "NV" + ID;
        this.name = name;
        this.positionID = pos;
        this.salary = salary;
        this.workDays = workDays;
        this.allowance = getAllowance2();
        setMonthlySalary();
        setPrize();
        this.tempEarn = getTempEarn();
    }
    
    public Employee(int ID,String name,long salary,long workDays,String pos){
        if(ID<10) this.ID = "NV0" + ID;
        else this.ID = "NV" + ID;
        this.name = name;
        this.positionID = pos;
        this.salary = salary;
        this.workDays = workDays;
        this.allowance = getAllowance2();
        setMonthlySalary();
        setPrize();
        this.tempEarn = getTempEarn();
    }

    public String getPositionID() {
        return positionID;
    }

    public long getFinalPay() {
        return finalPay;
    }

    public void setPrize() {
        if(workDays >=25) prize = 20*monthlySalary/100;
        else if(workDays>=22) prize = 10*monthlySalary/100;
        else prize = 0;
    }

    public String getID() {
        return ID;
    }

    private void setMonthlySalary() {
        monthlySalary = salary * workDays;
    }

    public long getMonthlySalary() {
        return monthlySalary;
    }
    
    public int getAllowance(){
        if(this.positionID.equals("GD"))return 500;
        else if(this.positionID.equals("PGD"))return 400;
        else if(this.positionID.equals("TP"))return 300;
        else if(this.positionID.equals("KT"))return 250;
        return 100;
    }
    
    public int getAllowance2(){
        if(this.positionID.equals("GD"))return 250000;
        else if(this.positionID.equals("PGD"))return 200000;
        else if(this.positionID.equals("TP"))return 180000;
        return 150000;
    }
    
    public int getTempEarn(){
        if( 2*(monthlySalary + allowance)/3.0 < 25000){
            return (int)Math.round(2*(monthlySalary + allowance)/3000.0)*1000;
        }
        return 25000;
    }
    
    public void show(){
        long remain = monthlySalary - tempEarn + allowance;
        System.out.printf("%s %s %d %d %d %d\n",ID,name,allowance,
                monthlySalary,tempEarn,remain);
    }
    
    public void show2(){
        finalPay = monthlySalary + prize + allowance;
        System.out.printf("%s %s %d %d %d %d\n",ID,name,monthlySalary,
                prize,allowance,finalPay);
    }
            
}
