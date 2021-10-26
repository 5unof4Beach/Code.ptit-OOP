package LopHocPhan;

/**
 *
 * @author suckm
 */
public class Department {
    private String id, name, group, lecturer;

    public Department(String id, String name, String group, String lecturer) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.lecturer = lecturer;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getLecturer() {
        return lecturer;
    }
    
    public void show(){
        System.out.printf("%s %s\n",group, lecturer);
    }
    
    public void show2(){
        System.out.printf("%s %s %s\n",id, name, group);
    }
}
