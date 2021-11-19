package DSMonHoc;

public class Student {
    private String id, name, cl, email;
    public Student(String id, String name, String cl, String email) {
        this.id = id;
        this.name = standardize(name);
        this.cl = cl;
        this.email = email;
    }
    public String standardize(String name){
        String[] s = name.toLowerCase().trim().split("\\s+");
        String res = "";
        for(int i = 0; i < s.length; i++){
            res += s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ";
        }
        return res.trim();
    }

    public String getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getCl() {
        return cl;
    }

    public String getEmail() {
        return email;
    }
}
