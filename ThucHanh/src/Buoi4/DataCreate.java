package Buoi4;

import java.io.*;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author suckm
 */
public class DataCreate {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("Data.in");
        ObjectOutputStream ois = new ObjectOutputStream(f);
        ArrayList<String> vanBanBin = new ArrayList<>();
        vanBanBin.add("PTIT duy tri hoc phi on dinh nam 2019 va khong tang trong nam 2020-2021 va 2021-2022!");
        ois.writeObject(vanBanBin);
        ois.close();
    }
}
