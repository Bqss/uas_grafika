package objects;

import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

public class Pohon2 extends Path2D.Double {
    public Pohon2(){
        Daun();
        Batang();

    }
    public Shape Daun(){
        //Daun
        RoundRectangle2D kotak2 = new RoundRectangle2D.Float(624,205,116,271,50,50);
        return kotak2;
    }
    public Shape Batang(){
        //batang
        this.moveTo(683,562);
        this.lineTo(683,299);
        //ranting
        this.moveTo(683,449);
        this.lineTo(714,421);
        this.moveTo(683,399);
        this.lineTo(651,370);
        this.moveTo(683,346);
        lineTo(714,314);
        return null;
    }

}
