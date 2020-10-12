package app;
import javax.swing.*;

class Main
{
    public static void main(String[]args) throws InterruptedException
    {
        JFrame f = new JFrame();
        f.setSize(100, 200);
        JLabel label;
        for(int i = 1;i<9;i++)
        {
            label = new JLabel(new ImageIcon("src/image_part_00"+i+".jpg"));
            f.add(label);
            f.setVisible(true);
            Thread.sleep(100);
            f.remove(label);
            f.revalidate();
            f.repaint();
            if(i==8) i = 1;
        }
    }

}