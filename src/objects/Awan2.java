package objects;

import java.awt.geom.Path2D;

public class Awan2 extends  Path2D.Double{
    double xInit = 292;
    double yInit = 230;
    public Awan2(double x, double y){
        double x2 = - this.xInit + x;
        double y2 = - this.yInit + y;

        this.moveTo(292 + x2,230 + y2);
        this.lineTo(313 + x2,230 + y2);
        closePath();

        this.moveTo(313+x2,230+y2);
        this.curveTo(307+x2,223+y2,304+x2,214+y2,304+x2,204+y2);
        this.curveTo(304+x2,180+y2,323+x2,161+y2,346+x2,161+y2);
        this.curveTo(360+x2,161+y2,373+x2,168+y2,380+x2,179+y2);
        this.curveTo(381+x2,178+y2,382+x2,178+y2,382+x2,178+y2);
        this.curveTo(406+x2,178+y2,425+x2,198+y2,425+x2,221+y2);
        this.curveTo(425+x2,224+y2,425+x2,227+y2,424+x2,230+y2);
        this.lineTo(424+x2,230+y2);
        closePath();

        this.moveTo(424+x2,230+y2);
        this.lineTo(442+x2,230+y2);
        closePath();

        this.moveTo(453+x2,230+y2);
        this.lineTo(489+x2,230+y2);
        closePath();




    }
}
