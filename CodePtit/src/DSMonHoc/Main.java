package DSMonHoc;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Subject> subjects = new Vector<>();
        for(int i = 1; i <= n; i++){
            Subject sv = new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            subjects.add(sv);
        }
        subjects.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));
        for(Subject i: subjects){
            System.out.println(i);
        }
    }
}
