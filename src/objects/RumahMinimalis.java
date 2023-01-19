package objects;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class RumahMinimalis extends Path2D.Double {

    double xInit = 154;
    double yInit = 628;

    public RumahMinimalis (double x, double y){
        Rectangle2D.Double r1 = new Rectangle2D.Double((167-this.xInit)+x,(609-this.yInit)+y,40,16);
        Rectangle2D.Double r2 = new Rectangle2D.Double((167-this.xInit)+x,(554-this.yInit)+y,16,55);
        Rectangle2D.Double r3 = new Rectangle2D.Double((191-this.xInit)+x,(554-this.yInit)+y,16,55);

        this.moveTo(x,y);
        this.lineTo((154 - this.xInit )+ x,(445- this.yInit)+ y);
        this.lineTo((221 - this.xInit )+ x,(467- this.yInit)+ y);
        this.lineTo((219 - this.xInit )+ x,(628- this.yInit)+ y);
        this.lineTo((154 - this.xInit) + x , (628- this.yInit) +  y);
//        this.closePath();

        for (double i = 0; i < 9; i++) {
            this.moveTo((166-this.xInit)+x,((473 - this.yInit + y) + 9 * i));
            this.lineTo((184-this.xInit)+x,((473 - this.yInit + y) + 9 * i));
        }

        for (double i = 0; i < 7; i++) {
            this.moveTo((190-this.xInit)+x,((483 - this.yInit + y)  + i * 10));
            this.lineTo((209-this.xInit)+x,((483 - this.yInit + y) + i * 10));
        }

        this.append(r1, false);
        this.append(r2,false);
        this.append(r3,false);
    }

}
