package XepHangCheckIn;

/**
 *
 * @author suckm
 */
public class Khach {
    private long arrival,time;

    public Khach(long arrival, long time) {
        this.arrival = arrival;
        this.time = time;
    }

    public long getArrival() {
        return arrival;
    }

    public long getTime() {
        return time;
    }
    
}
