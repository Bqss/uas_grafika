package objects;

import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

public class Pohon3 extends Path2D.Double{
    double xInit = 735;
    double yInit = 554;
    public Pohon3(double x , double y){
        double x2 = -this.xInit + x;
        double y2 = -this.yInit + y;
        RoundRectangle2D.Double daun = new RoundRectangle2D.Double(732+x2,534+y2,7,13,50,50);


        this.moveTo(x,y);
        this.lineTo(735 + x2,540+y2);
        this.append(daun,false);


    }

}
