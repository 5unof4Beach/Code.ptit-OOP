package LyThuyetGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class TableFrame extends JFrame{

    public TableFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        
        JTable myTable = new JTable();
        DefaultTableModel def = new DefaultTableModel();
        String row[] = {"186", "duc","gmail.com"};
        def.addRow(row);
        def.addRow(row);
        def.addRow(row);
        
        
        myTable.setModel(def);
                
        add(myTable, BorderLayout.SOUTH);
    }

}
