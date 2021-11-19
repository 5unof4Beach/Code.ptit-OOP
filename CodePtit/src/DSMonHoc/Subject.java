package DSMonHoc;

public class Subject {
    private String id, name;
    private int stc;

    public Subject(String id, String name, int stc) {
        this.id = id;
        this.name = name;
        this.stc = stc;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return id + " " + name +  " " + stc;
    }
}
