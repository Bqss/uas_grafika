package objects;

import java.awt.geom.Path2D;

public class Awan2 extends  Path2D.Double{
    int xInit = 496;
    int yInit = 490;
    public Awan2(int x, int y){
        int x2 = - this.xInit + x;
        int y2 = - this.yInit + y;

        this.moveTo(496 + x2,490 + y2);
        this.lineTo(533 + x2,490 + y2);
        closePath();

        this.moveTo(533+x2,490+y2);
        this.curveTo(523+x2,477+y2,517+x2,462+y2,517+x2,444+y2);
        this.curveTo(517+x2,404+y2,550+x2,371+y2,591+x2,371+y2);
        this.curveTo(615+x2,371+y2,637+x2,382+y2,650+x2,401+y2);
        this.curveTo(694+x2,400+y2,727+x2,433+y2,727+x2,474+y2);
        this.curveTo(727+x2,479+y2,727+x2,485+y2,726+x2,490+y2);
        this.lineTo(533+x2,490+y2);
        closePath();

        this.moveTo(726+x2,490+y2);
        this.lineTo(758+x2,490+y2);
        closePath();

        this.moveTo(776+x2,490+y2);
        this.lineTo(838+x2,490+y2);
        closePath();




    }
}
