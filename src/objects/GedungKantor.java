package objects;

import java.awt.geom.Path2D;

public class GedungKantor extends Path2D.Double {
    public GedungKantor(double x, double y){
        double xInit = -19 +x;
        double yInit = -630+y;

        int gap = 17;

        this.moveTo(x,y);
        this.lineTo(x,(333 - 630) +y );
        this.lineTo((43+xInit) ,( 333+yInit));
        this.lineTo((43+xInit) ,( 297+yInit));
        this.quadTo((47+xInit),( 284+yInit),(60+xInit),(280+yInit));
        this.lineTo((93+xInit),(280+yInit));
        this.quadTo((108+xInit),(285+yInit),(110+xInit),(297+yInit));
        this.lineTo((110+xInit),(333+yInit));
        this.lineTo((43+xInit),(333+yInit));
        this.moveTo((110+xInit),(333+yInit));

        this.lineTo((138+xInit),(333+yInit));
        this.lineTo((138+xInit),y);
        this.lineTo(x,y);

        this.moveTo((36+xInit),(333+yInit));
        this.lineTo((36+xInit),y);
        this.moveTo((57+xInit),(333+yInit));
        this.lineTo((57+xInit),y);
        this.moveTo((77+xInit),(333+yInit));
        this.lineTo((77+xInit),(588+yInit));
        this.moveTo((98+xInit),(333+yInit));
        this.lineTo((98+xInit),y);
        this.moveTo((119+xInit),(333+yInit));
        this.lineTo((119+xInit),y);

        for (int i = 1; i < 16 ; i++) {
            double y1 = (333 - 630+y)+i * gap;
            this.moveTo((36+xInit)  , y1);
            this.lineTo((119+xInit) , y1);
        }

        this.moveTo((66+xInit),(628+yInit));
        this.lineTo((66+xInit),(615+yInit));
        this.curveTo((66+xInit),(608+yInit),(72+xInit),(603+yInit),(79+xInit),(603+yInit));
        this.curveTo((85+xInit),(603+yInit),(91+xInit),(608+yInit),(91+xInit),(615+yInit));
        this.lineTo((91+xInit),(628+yInit));
        this.lineTo((66+xInit),(628+yInit));


        this.moveTo((55+xInit),(325+yInit));
        this.lineTo((55+xInit),(320+yInit));
        this.curveTo((55+xInit),(319+yInit),(56+xInit),(318+yInit),(57+xInit),(318+yInit));
        this.lineTo((64+xInit),(318+yInit));
        this.curveTo((65+xInit),(318+yInit),(66+xInit),(319+yInit),(66+xInit),(320+yInit));
        this.lineTo((66+xInit),(325+yInit));
        this.curveTo((66+xInit),(326+yInit),(65+xInit),(327+yInit),(64+xInit),(327+yInit));
        this.lineTo((57+xInit),(327+yInit));
        this.curveTo((56+xInit),(327+yInit),(55+xInit),(326+yInit),(55+xInit),(325+yInit));

        this.moveTo((55+18+xInit),(325+yInit));
        this.lineTo((55+18+xInit),(320+yInit));
        this.curveTo((55+18+xInit),(319+yInit),(56+18+xInit),(318+yInit),(57+18+xInit),(318+yInit));
        this.lineTo((64+18+xInit),(318+yInit));
        this.curveTo((65+18+xInit),(318+yInit),(66+18+xInit),(319+yInit),(66+18+xInit),(320+yInit));
        this.lineTo((66+18+xInit),(325+yInit));
        this.curveTo((66+18+xInit),(326+yInit),(65+18+xInit),(327+yInit),(64+18+xInit),(327+yInit));
        this.lineTo((57+18+xInit),(327+yInit));
        this.curveTo((56+18+xInit),(327+yInit),(55+18+xInit),(326+yInit),(55+18+xInit),(325+yInit));

        this.moveTo((55+36+xInit),(325+yInit));
        this.lineTo((55+36+xInit),(320+yInit));
        this.curveTo((55+36+xInit),(319+yInit),(56+36+xInit),(318+yInit),(57+36+xInit),(318+yInit));
        this.lineTo((64+36+xInit),(318+yInit));
        this.curveTo((65+36+xInit),(318+yInit),(66+36+xInit),(319+yInit),(66+36+xInit),(320+yInit));
        this.lineTo((66+36+xInit),(325+yInit));
        this.curveTo((66+36+xInit),(326+yInit),(65+36+xInit),(327+yInit),(64+36+xInit),(327+yInit));
        this.lineTo((57+36+xInit),(327+yInit));
        this.curveTo((56+36+xInit),(327+yInit),(55+36+xInit),(326+yInit),(55+36+xInit),(325+yInit));

        this.moveTo((62+xInit),(306+yInit));
        this.curveTo((62+xInit),(300+yInit),(66+xInit),(295+yInit),(72+xInit),(295+yInit));
        this.lineTo((84+xInit),(295+yInit));
        this.curveTo((90+xInit),(295+yInit),(94+xInit),(300+yInit),(94+xInit),(306+yInit));
        this.lineTo((62+xInit),(306+yInit));

    }

}
