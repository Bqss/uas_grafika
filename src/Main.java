import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

import assset.Background;
import objects.Pesawat;


public class Main extends JPanel {
    AffineTransform background = new AffineTransform();
    AffineTransform pesawat = new AffineTransform();
    double bgPosX  = 0  ;
    boolean isDown = false;
    double  [] pesawatPos  = {55,570} ;

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Background bg = new Background(g2d);

        GeneralPath.Double  dsf = new GeneralPath.Double();


        Pesawat miring = new Pesawat(pesawatPos[0] * (1/0.4),pesawatPos[1]* (1/0.4),g2d);
        g2d.setTransform(background);
        g2d.setStroke(new BasicStroke(1f));
        g2d.draw(bg);
        g2d.setTransform(pesawat);
        g2d.draw(miring);
    }

    public static void main(String[] args) {
        Main test = new Main();
        JFrame frame = new JFrame();

        frame.add(test);
        frame.setSize(1080,720);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

//      using thread
        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                test.background.setToIdentity();
                test.pesawat.setToIdentity();
                if (test.bgPosX <= -1080*3){
                    test.bgPosX = 0;
                    test.isDown = false;
                }
//              translating the backgorund each 10 ms
                test.background.translate(test.bgPosX ,0);
                test.bgPosX -= 1.5 ;
//              animating the plane

                test.pesawat.setToScale(0.4,0.4);
                test.pesawat.translate(test.pesawatPos[0],0);
                test.pesawatPos[0] += 0.1;

                if(test.pesawatPos[1] <= 200){
                    test.isDown = true;
                }

                if(test.isDown){
                    test.pesawatPos[1] += 0.3;
                }else{
                    test.pesawatPos[1] -= 0.3;
                }

//                System.out.println(test.pesawatPos[1]);;
//                test.pesawat.concatenate(new AffineTransform().);

                frame.repaint();

            }
        });
        timer.start();

    }

}


