import javax.swing.*;
import java.awt.*;
import objects.*;



public class Main extends JFrame {
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GedungMinimalis gm1 = new GedungMinimalis(400,500);

        g2d.draw(gm1);

    }
    public static void main(String[] args) {
        Main test = new Main();
        test.setSize(1920,1080);
        test.setLocationRelativeTo(null);
        test.setVisible(true);

    }
}


