package LyThuyetGUI;

/**
 *
 * @author suckm
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
public class MyFrame extends JFrame{

    public MyFrame(String title) throws HeadlessException, IOException {
        super(title);
        setLayout(new BorderLayout());
        JTextField text = new JTextField("0");
//        text.setSize(WIDTH, 60);
        text.setAlignmentY(RIGHT_ALIGNMENT);
        add(text, BorderLayout.NORTH);
        
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK");
            }
        });
        
        add(b, BorderLayout.WEST);
        
        JPanel p1 = new JPanel();
        String[] labels = {
            "%","CE","C","<*","1/x",
            "x^2","Sqrt x","x^(-1/2)","/",
            "7","8","9","x"
            ,"4","5","6","-"
            ,"1","2","3","+"
            ,"+/-","0",".","="};
        p1.setLayout(new GridLayout(6,4));
        for(int i = 0; i<24; i++){
            JButton temp = new JButton("" + labels[i]);
            temp.setSize(10, 10);
            p1.add(temp);
        }
        add(p1, BorderLayout.SOUTH);
    }
    
}
