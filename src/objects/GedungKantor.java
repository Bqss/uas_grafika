package objects;

import java.awt.geom.Path2D;

public class GedungKantor extends Path2D.Double {
    public GedungKantor(double x, double y){

        int gap = 17;

        this.moveTo(x,y);
        this.lineTo(x,333 );
        this.lineTo((43-19)+x ,( 333 - 630)+y);
        this.lineTo((43-19)+x ,( 297 - 630)+y);
        this.quadTo((47-19)+x,( 284 - 630)+y,(60-19)+x,(280-630)+y);
        this.lineTo((93-19)+x,(280 - 630)+y);
        this.quadTo((108-19)+x,(285 - 630)+y,(110-19)+x,(297-630)+y);
        this.lineTo((110-19)+x,(333 - 630)+y);
        this.lineTo((43-19)+x,(333 - 630)+y);
        this.moveTo((110-19)+x,(333 - 630)+y);

        this.lineTo((138-19)+x,(333 - 630)+y);
        this.lineTo((138-19)+x,y);
        this.lineTo(x,y);

        this.moveTo((36-19)+x,(333 - 630)+y);
        this.lineTo((36-19)+x,y);
        this.moveTo((57-19)+x,(333 - 630)+y);
        this.lineTo((57-19)+x,y);
        this.moveTo((77-19)+x,(333 - 630)+y);
        this.lineTo((77-19)+x,(588 - 630)+y);
        this.moveTo((98-19)+x,(333 - 630)+y);
        this.lineTo((98-19)+x,y);
        this.moveTo((119-19)+x,(333 - 630)+y);
        this.lineTo((119-19)+x,y);

        for (int i = 1; i < 16 ; i++) {
            double y1 = (333 - 630 + y) + i * gap;
            this.moveTo((36-19)+x  , y1);
            this.lineTo((119-19)+x , y1);
        }

        this.moveTo((66-19)+x,(628 - 630)+y);
        this.lineTo((66-19)+x,(615 - 630)+y);
        this.curveTo((66-19)+x,(608 - 630)+y,(72-19)+x,(603-630)+y,(79-19)+x,(603-630)+y);
        this.curveTo((85-19)+x,(603 - 630)+y,(91-19)+x,(608-630)+y,(91-19)+x,(615-630)+y);
        this.lineTo((91-19)+x,(628 - 630)+y);
        this.lineTo((66-19)+x,(628 - 630)+y);


        this.moveTo((55-19)+x,(325 - 630)+y);
        this.lineTo((55-19)+x,(320 - 630)+y);
        this.curveTo((55-19)+x,(319 - 630)+y,(56-19)+x,(318-630)+y,(57-19)+x,(318-630)+y);
        this.lineTo((64-19)+x,(318 - 630)+y);
        this.curveTo((65-19)+x,(318 - 630)+y,(66-19)+x,(319-630)+y,(66-19)+x,(320-630)+y);
        this.lineTo((66-19)+x,(325 - 630)+y);
        this.curveTo((66-19)+x,(326 - 630)+y,(65-19)+x,(327-630)+y,(64-19)+x,(327-630)+y);
        this.lineTo((57-19)+x,(327 - 630)+y);
        this.curveTo((56-19)+x,(327 - 630)+y,(55-19)+x,(326-630)+y,(55-19)+x,(325-630)+y);

        this.moveTo((55+18-19)+x,(325-630)+y);
        this.lineTo((55+18-19)+x,(320-630)+y);
        this.curveTo((55+18-19)+x,(319-630)+y,(56+18-19)+x,(318-630)+y,(57+18-19)+x,(318-630)+y);
        this.lineTo((64+18-19)+x,(318-630)+y);
        this.curveTo((65+18-19)+x,(318-630)+y,(66+18-19)+x,(319-630)+y,(66+18-19)+x,(320-630)+y);
        this.lineTo((66+18-19)+x,(325-630)+y);
        this.curveTo((66+18-19)+x,(326-630)+y,(65+18-19)+x,(327-630)+y,(64+18-19)+x,(327-630)+y);
        this.lineTo((57+18-19)+x,(327-630)+y);
        this.curveTo((56+18-19)+x,(327-630)+y,(55+18-19)+x,(326-630)+y,(55+18-19)+x,(325-630)+y);

        this.moveTo((55+36-19)+x,(325-630)+y);
        this.lineTo((55+36-19)+x,(320-630)+y);
        this.curveTo((55+36-19)+x,(319-630)+y,(56+36-19)+x,(318-630)+y,(57+36-19)+x,(318-630)+y);
        this.lineTo((64+36-19)+x,(318-630)+y);
        this.curveTo((65+36-19)+x,(318-630)+y,(66+36-19)+x,(319-630)+y,(66+36-19)+x,(320-630)+y);
        this.lineTo((66+36-19)+x,(325-630)+y);
        this.curveTo((66+36-19)+x,(326-630)+y,(65+36-19)+x,(327-630)+y,(64+36-19)+x,(327-630)+y);
        this.lineTo((57+36-19)+x,(327-630)+y);
        this.curveTo((56+36-19)+x,(327-630)+y,(55+36-19)+x,(326-630)+y,(55+36-19)+x,(325-630)+y);

        this.moveTo((62-19)+x,(306 - 630)+y);
        this.curveTo((62-19)+x,(300 - 630)+y,(66-19)+x,(295-630)+y,(72-19)+x,(295-630)+y);
        this.lineTo((84-19)+x,(295 - 630)+y);
        this.curveTo((90-19)+x,(295 - 630)+y,(94-19)+x,(300-630)+y,(94-19)+x,(306-630)+y);
        this.lineTo((62-19)+x,(306 - 630)+y);

    }

}
