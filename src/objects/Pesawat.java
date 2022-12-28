package objects;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class Pesawat extends Path2D.Double {
    public Pesawat(int x, int y){
        Ellipse2D.Double l = new Ellipse2D.Double(x + 76,y + 68,25,25);
        Ellipse2D.Double l2 = new Ellipse2D.Double(x + 130.7,y + 63,32,32);
        Ellipse2D.Double l3 = new Ellipse2D.Double(x + 199.5,y + 66,32.5,32.5);
        this.moveTo(x,y);
        this.curveTo((192 - 172) + x,(236 - 240) + y ,(199 - 172) +x,(262 - 240) + y,(205 - 172 )+x,(275 - 240)+y);
        this.curveTo((206 - 172) + x,(276 - 240) + y ,(207 - 172) +x,(277 - 240) + y,(209 - 172 )+x,(277 - 240)+y);
        this.quadTo((335 - 172) + x,(250 - 240) + y ,(465 - 172) +x,(281 - 240) + y);
        this.curveTo((500 - 172) + x,(291 - 240) + y ,(525 - 172) +x,(307 - 240) + y,(533 - 172 )+x,(334 - 240)+y);
        this.moveTo((465 - 172) + x,(281 - 240) + y );
        this.curveTo((456 - 172) + x,(305 - 240) + y ,(462 - 172) +x,(332 - 240) + y,(486 - 172 )+x,(342 - 240)+y);
        this.curveTo((502 - 172) + x,(348 - 240) + y ,(519 - 172) +x,(345 - 240) + y,(533 - 172 )+x,(335 - 240)+y);
        this.quadTo((537 - 172) + x,(343 - 240) + y ,(535 - 172) +x,(350 - 240) + y);
        this.quadTo((532 - 172) + x,(375 - 240) + y ,(515 - 172) +x,(391 - 240) + y);
        this.quadTo((492 - 172) + x,(412 - 240) + y ,(400 - 172) +x,(409 - 240) + y);
        this.quadTo((405 - 172) + x,(387 - 240) + y ,(400 - 172) +x,(370 - 240) + y);
        this.quadTo((398 - 172) + x,(369 - 240) + y ,(394 - 172) +x,(367 - 240) + y);
        this.lineTo((322 - 172) + x,(367 - 240) + y );
        this.quadTo((320 - 172) + x,(368 - 240) + y ,(320 - 172) +x,(370 - 240) + y);
        this.lineTo((321 - 172) + x,(410 - 240) + y );
        this.quadTo((322 - 172) + x,(500 - 240) + y ,(343 - 172) +x,(540 - 240) + y);
        this.curveTo((376 - 172) + x,(546 - 240) + y ,(395 - 172) +x,(462 - 240) + y,(400 - 172 )+x,(409 - 240)+y);
        this.moveTo((321 - 172) + x,(410 - 240) + y );
        this.quadTo((220 - 172) + x,(405 - 240) + y ,(181 - 172) +x,(375 - 240) + y);
        this.curveTo((123 - 172) + x,(290 - 240) + y ,(152 - 172) +x,(245 - 240) + y,x,y);
        this.moveTo((313 - 172) + x,(265 - 240) + y );
        this.quadTo((297 - 172) + x,(130 - 240) + y ,(313 - 172) +x,(121 - 240) + y);
        this.curveTo((354 - 172) + x,(108 - 240) + y ,(390 - 172) +x,(239 - 240) + y,(389 - 172 )+x,(268 - 240)+y);
        this.moveTo((203 - 172) + x,(371 - 240) + y );
        this.lineTo((210 - 172) + x,(378 - 240) + y );
        this.lineTo((242 - 172) + x,(384 - 240) + y );
        this.lineTo((203 - 172) + x,(371 - 240) + y );
        this.moveTo((221 - 172) + x,(385 - 240) + y );
        this.quadTo((245 - 172) + x,(396 - 240) + y ,(269 - 172) +x,(397 - 240) + y);
        this.quadTo((279 - 172) + x,(396 - 240) + y ,(286 - 172) +x,(398 - 240) + y);
        this.lineTo((263 - 172) + x,(390 - 240) + y );
        this.lineTo((221 - 172) + x,(385 - 240) + y );

        this.append(l,false);
        this.append(l2,false);
        this.append(l3,false);

    }
}



