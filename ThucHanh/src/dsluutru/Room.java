package dsluutru;

/**
 *
 * @author suckm
 */
public class Room {
    String name, infos, roomType;
    public float dailyFee, serviceFee;

    public Room(String info) {
        this.infos = info;
        String[] infos = info.split(" ");
        this.name = infos[1];
        this.roomType = infos[0];
        dailyFee = Float.parseFloat(infos[2]);
        serviceFee = Float.parseFloat(infos[3]);
//        System.out.println(infos[2]);
//        System.out.println(infos[3]);
    }

    public String getName() {
        return name;
    }
    
    public float getDailyFee(){
        return dailyFee;
    }
    
    public float getServiceFee(){
        return dailyFee * serviceFee;
    }
    
    public String getRoomType() {
        return roomType;
    }
    
}
