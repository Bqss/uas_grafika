package objects;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

/*
* parameter x- for upper left corner x of the outer square
* parameter y- for upper left corner y of the outer square
*
* */


public class GedungMinimalis extends Path2D.Double {
    int xInit = 1808;
    int yInit = 425;
    public GedungMinimalis(int x, int y){
        Rectangle2D.Double outer = new Rectangle2D.Double(x,y,83,202);

        for (int i = 0; i < 3; i++) {
            Rectangle2D.Double dummy = new Rectangle2D.Double((1819- xInit)+x ,(438- yInit)+y + 29 * i,18,16);
            this.append(dummy, false);
        }
        for (int i = 0; i < 3; i++) {
            Rectangle2D.Double dummy = new Rectangle2D.Double((1857- xInit)+x ,(438- yInit)+y + 29 * i,18,16);
            this.append(dummy, false);
        }

        this.append(outer, false);

    }
}
