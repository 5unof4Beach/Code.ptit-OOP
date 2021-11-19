package cacbaivesinhvien;

/**
 *
 * @author suckm
 */
public class Student {
    private String id, name, cl, email;

    public Student(String id, String name, String cl, String email) {
        this.id = id;
        this.name = Standardize(name);
        this.cl = cl;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    
    
    
    public String Standardize(String str){
        String name[] = str.trim().toLowerCase().split("\\s+");
        String res  = "";
        
        for(String i:name){
            String temp = i.substring(0,1).toUpperCase() + i.substring(1) + " ";
            res += temp;
        }
        return res.trim();
    }
    
    public void show(){
        System.out.printf("%s %s %s %s\n", id, name, cl, email);
    }
}
