package prac_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame {
    int b1 = 0;
    int b2 = 0;
    Window()
    {
        super("Match");
        setLayout(new FlowLayout());
        setSize(300,300);
        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");
        but1.setPreferredSize(new Dimension(120,20));
        but2.setPreferredSize(new Dimension(120,20));
        but1.setAlignmentX(SwingConstants.EAST);
        but2.setAlignmentX(SwingConstants.WEST);

        JLabel count = new JLabel("Result: 0 X 0");

        JLabel last = new JLabel("Last Scorer: N/A");

        JLabel winner = new JLabel("Winner: DRAW");


        add(but1);
        add(but2);
        add(count);
        add(last);
        add(winner);
        setVisible(true);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1++;
                count.setText("Result: " + b1 + " X " + b2);
                last.setText("Last Scorer: AC Milan");
                if(b1 > b2) winner.setText("Winner: AC MILAN");
                else if (b1 == b2)  winner.setText("Winner: DRAW");
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2++;
                count.setText("Result: " + b1 + " X " + b2);
                last.setText("Last Scorer: Real Madrid");
                if(b2 > b1) winner.setText("Winner: REAL MADRID");
                else if (b1 == b2)  winner.setText("Winner: DRAW");
            }
        });
    }
}
