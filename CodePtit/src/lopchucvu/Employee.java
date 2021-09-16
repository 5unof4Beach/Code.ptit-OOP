package lopchucvu;

/**
 *
 * @author suckm
 */
public class Employee {
    private String ID,name,positionID;
    private int workDays,salary,monthlySalary,allowance,tempEarn;
    
    public Employee(int ID,String name,String pos,int salary,int workDays){
        if(ID<10) this.ID = "NV0" + ID;
        else this.ID = "NV" + ID;
        this.name = name;
        this.positionID = pos;
        this.salary = salary;
        this.workDays = workDays;
        this.allowance = getAllowance();
        setMonthlySalary();
        this.tempEarn = getTempEarn();
    }

    public String getPositionID() {
        return positionID;
    }

    public String getID() {
        return ID;
    }

    private void setMonthlySalary() {
        monthlySalary = salary * workDays;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
    
    public int getAllowance(){
        if(this.positionID.equals("GD"))return 500;
        else if(this.positionID.equals("PGD"))return 400;
        else if(this.positionID.equals("TP"))return 300;
        else if(this.positionID.equals("KT"))return 250;
        return 100;
    }
    
    public int getTempEarn(){
        if( 2*(monthlySalary + allowance)/3.0 < 25000){
            return (int)Math.round(2*(monthlySalary + allowance)/3000.0)*1000;
        }
        return 25000;
    }
    
    public void show(){
        int remain = monthlySalary - tempEarn + allowance;
        System.out.printf("%s %s %d %d %d %d\n",ID,name,allowance,
                monthlySalary,tempEarn,remain);
    }
            
}
