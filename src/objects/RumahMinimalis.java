package objects;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class RumahMinimalis extends Path2D.Double {

    int xInit = 154;
    int yInit = 628;

    public RumahMinimalis (int x, int y){
        Rectangle2D.Double r1 = new Rectangle2D.Double((167-this.xInit)+x,(609-this.yInit)+y,40,16);
        Rectangle2D.Double r2 = new Rectangle2D.Double((167-this.xInit)+x,(554-this.yInit)+y,16,55);
        Rectangle2D.Double r3 = new Rectangle2D.Double((191-this.xInit)+x,(554-this.yInit)+y,16,55);

        this.moveTo(x,y);
        this.lineTo((154 - this.xInit )+ this.xInit,(445- this.yInit)+this.yInit);
        this.lineTo((219 - this.xInit )+ this.xInit,(467- this.yInit)+this.yInit);
        this.lineTo((219 - this.xInit )+ this.xInit,(628- this.yInit)+this.yInit);
        this.closePath();

        for (int i = 0; i < 9; i++) {
            this.moveTo((166-this.xInit)+x,((473 - this.yInit + y) + 9 * i));
            this.lineTo((184-this.xInit)+x,((473 - this.yInit + y) + 9 * i));
        }

        for (int i = 0; i < 7; i++) {
            this.moveTo((190-this.xInit)+x,((483 - this.yInit + y)  + i * 10));
            this.lineTo((209-this.xInit)+x,((483 - this.yInit + y) + i * 10));
        }

        this.append(r1, false);
        this.append(r2,false);
        this.append(r3,false);
    }

}
