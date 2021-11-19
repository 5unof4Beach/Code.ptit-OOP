package dsluutru;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class QuanLyKhachSan {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<Customer> ds = new ArrayList<>();
        HashMap<String, Room> rooms = new HashMap<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=n; i++){
            Room m = new Room(sc.nextLine());
            rooms.put(m.getRoomType(), m);
        }
        
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=n; i++){
            String name = sc.nextLine();
            String room = sc.nextLine();
            String dayIn = sc.nextLine();
            String dayOut = sc.nextLine();
            Customer c = new Customer(i, name, room, dayIn, dayOut);
            c.setRoom(rooms.get(room.substring(2,3)));
            ds.add(c);
        }
        
        ds.sort((i1,i2) -> Long.compare(i2.getDaysStay(), i1.getDaysStay()));
        
        for(Customer i:ds){
            i.show();
        }
    }
}
