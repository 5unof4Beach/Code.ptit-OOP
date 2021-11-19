package LyThuyetGUI;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table {
    public static void main(String[] args) {
        TableFrame f = new TableFrame("Table");
        f.setSize(600, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


