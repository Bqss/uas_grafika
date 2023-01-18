package objects;

import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Path2D;

public class Pohon extends Path2D.Double {
    int xInit = 287;
    int yInit = 572;

    public  Pohon(double x, double y){
        //daun
        Arc2D bunder = new Arc2D.Double((275-this.xInit)+x, (556-this.yInit)+y, 8.6,8.6, 0, 360, Arc2D.OPEN);
        this.append(bunder,false);

        Arc2D bunder2 = new Arc2D.Double((295-this.xInit)+x, (549-this.yInit)+y, 8.6,8.6, 0, 360, Arc2D.OPEN);
        this.append(bunder2, false);

        Arc2D bunder3 = new Arc2D.Double((272-this.xInit)+x, (516-this.yInit)+y, 31,31, 0, 360, Arc2D.OPEN);
        this.append(bunder3,false);

        Arc2D bunder4 = new Arc2D.Double((268-this.xInit)+x, (530-this.yInit)+y, 15,15, 0, 360, Arc2D.OPEN);
        this.append(bunder4,false);

        Arc2D bunder5 = new Arc2D.Double((292-this.xInit)+x, (517-this.yInit)+y, 12,12, 0, 360, Arc2D.OPEN);
        this.append(bunder5,false);

        this.moveTo(x,y);
        //batang pohon
        this.lineTo((287-this.xInit)+x,(568-this.yInit)+y);
        this.lineTo((282-this.xInit)+x,(563-this.yInit)+y);
        this.moveTo((287-this.xInit)+x,(568-this.yInit)+y);
        this.lineTo((287-this.xInit)+x,(564-this.yInit)+y);
        this.lineTo((296-this.xInit)+x,(555-this.yInit)+y);
        this.moveTo((287-this.xInit)+x,(564-this.yInit)+y);
        this.lineTo((287-this.xInit)+x,(547-this.yInit)+y);


    }
}


