package lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JFrame f;
    private static JTextArea text;
    public static void main(String[]Args)
    {
        f = new JFrame();
        f.setSize(500, 200);
        CreateMenu();
        text = new JTextArea();
        text.setFont(new Font("Times New Roman",Font.BOLD,18));
        f.add(text);
        f.setVisible(true);
    }
    public static void CreateMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());
        f.setJMenuBar(menuBar);
    }
    public static class BlueL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setForeground(Color.BLUE);
        }
    }
    public static class RedL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setForeground(Color.RED);
        }
    }
    public static class BlackL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setForeground(Color.BLACK);
        }
    }
    public static class TNRL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setFont(new Font("Times New Roman",Font.BOLD,18));
        }
    }
    public static class MSSSL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setFont(new Font("Ms Sans Serif",Font.BOLD,18));
        }
    }
    public static class SNL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setFont(new Font("Courier New",Font.BOLD,18));
        }
    }
    public static JMenu createColorMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Color");

        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem black = new JMenuItem("Black");
        file.add(blue);
        file.addSeparator();
        file.add(red);
        file.addSeparator();
        file.add(black);

        blue.addActionListener(new BlueL());
        red.addActionListener(new RedL());
        black.addActionListener(new BlackL());

        return file;
    }
    public static JMenu createFontMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Font");

        JMenuItem tNR = new JMenuItem("Times New Roman");
        JMenuItem mSSS = new JMenuItem("MS Sans Serif");
        JMenuItem cN = new JMenuItem("Courier New");
        file.add(tNR);
        file.addSeparator();
        file.add(mSSS);
        file.addSeparator();
        file.add(cN);

        tNR.addActionListener(new TNRL());
        mSSS.addActionListener(new MSSSL());
        cN.addActionListener(new SNL());
        
        return file;
    }
}
