package quanlybaitapnhom;

public class Member {

    private String ID, name, phoneNum,subject;
    private int team;

    public Member(String ID, String name, String phoneNum, int team) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.team = team;
    }
    public Member(String ID, String name, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getID() {
        return ID;
    }

    public int getTeam() {
        return team;
    }

    public void show() {
        System.out.printf("%s %s %s \n", ID, name, phoneNum);
    }
    
    public void show2() {
        System.out.printf("%s %s %s %d %s\n", ID, name, phoneNum,team,subject);
    }
}
