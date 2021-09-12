/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochoigame;
import java.text.ParseException;
import java.util.*;

public class TinhGio {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Player> res = new Vector<Player>();
        for(int i=0;i<n;i++){
            
            Player player = new Player();
            player.setId(sc.nextLine());
            player.setName(sc.nextLine());
            player.setTimeIn(sc.nextLine());
            player.setTimeOut(sc.nextLine());
            player.setTimePlay();
            res.add(player);
            
        }
        Collections.sort(res,new myCompare());
        for(Player element:res){
            element.show();
        }
    }
}

class myCompare implements Comparator<Player>{
    public int compare(Player p1,Player p2){
        if(p1.getTimePlayed() < p2.getTimePlayed())
            return 1;
        
        else
            return -1;
        }
    }