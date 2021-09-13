/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopsinhvien;

/**
 *
 * @author suckm
 */
public class SV {
    private String id;
    private String fullName;
    private String cl;
    private String email;

    public SV(String id, String fullName, String cl, String email) {
        this.id = id;
        this.fullName = fullName;
        this.cl = cl;
        this.email = email;
    }

    public String getCl() {
        return cl;
    }
    
    public String getId() {
        return id;
    }

    public String toString() {
        return String.format("%s %s %s %s", id, fullName, cl, email);
    }
}
