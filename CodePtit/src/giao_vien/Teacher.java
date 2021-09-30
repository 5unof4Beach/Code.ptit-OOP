package giao_vien;

public class Teacher {
    private String id,name,pos;
    private long salary,allowance,salaryRank;

    public Teacher(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        setAllowance();
        setSalaryRank();
    }

    public void setSalaryRank() {
        salaryRank = (id.charAt(2) - '0')*10 + (id.charAt(3) - '0');
    }

    public void setAllowance() {
        String temp = id.substring(0,2);
        pos = temp;
        if(temp.equals("HT")) allowance = 2000000;
        else if(temp.equals("HP")) allowance = 900000;
        else allowance = 500000;
    }

    public String getPos() {
        return pos;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d %d\n",
                            id,
                            name,
                            salaryRank,
                            allowance,
                            salary * salaryRank + allowance);
    }
    
}
