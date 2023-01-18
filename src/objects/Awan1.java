package objects;

import java.awt.geom.Path2D;

public class Awan1 extends Path2D.Double {
    int xInit = 587;
    int yInit = 124;
    public Awan1(int x, int y){
        int x2 = - this.xInit + x;
        int y2 = - this.yInit + y;


        this.moveTo(x, y);
        this.curveTo(587+x2,108+y2,600+x2,95+y2,620+x2,95+y2);
        this.curveTo(625+x2,87+y2,635+x2,81+y2,645+x2,81+y2);
        this.curveTo(656+x2,81+y2,665+x2,87+y2,670+x2,95+y2);
        this.curveTo(675+x2,92+y2,680+x2,91+y2,686+x2,91+y2);
        this.curveTo(702+x2,91+y2,715+x2,104+y2,715+x2,120+y2);
        this.curveTo(715+x2,136+y2,702+x2,149+y2,686+x2,149+y2);
        this.curveTo(682+x2,149+y2,679+x2,149+y2,676+x2,148+y2);
        this.curveTo(671+x2,155+y2,662+x2,160+y2,652+x2,160+y2);
        this.curveTo(643+x2,160+y2,635+x2,156+y2,630+x2,149+y2);
        this.curveTo(625+x2,152+y2,621+x2,153+y2,616+x2,153+y2);
        this.curveTo(600+x2,153+y2,586+x2,140+y2,586+x2,124+y2);
        //this.curveTo(586+x2,107+y2,600+x2,94+y2,616+x2,94+y2);
        this.closePath();
    }
}
