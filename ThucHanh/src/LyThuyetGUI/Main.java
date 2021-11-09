package LyThuyetGUI;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author suckm
 */
public class Main {
    public static void main(String[] args) throws HeadlessException, IOException {
        MyFrame f = new MyFrame("Calculator");
        f.setSize(600, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
