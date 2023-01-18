package objects;


import java.awt.geom.Path2D;

import java.awt.geom.RoundRectangle2D;

public class Pohon2 extends Path2D.Double {
    int xInit = 637;
    int yInit = 571;
    public Pohon2(int x, int y){
        RoundRectangle2D daun = new RoundRectangle2D.Float((620- this.xInit)+x,(475-this.yInit)+y,33,77,50,50);
       this.moveTo(x,y);
       this.lineTo((637-this.xInit)+x,(539-this.yInit)+y);
       this.lineTo((646-this.xInit)+x,(531-this.yInit)+y);
       this.moveTo((637-this.xInit)+x,(539-this.yInit)+y);
       this.lineTo((637-this.xInit)+x,(525-this.yInit)+y);
       this.lineTo((628-this.xInit)+x,(516-this.yInit)+y);
       this.moveTo((637-this.xInit)+x,(525-this.yInit)+y);
       this.lineTo((637-this.xInit)+x,(510-this.yInit)+y);
       this.lineTo((646-this.xInit)+x,(501-this.yInit)+y);
       this.moveTo((637-this.xInit)+x,(510-this.yInit)+y);
       this.lineTo((637-this.xInit)+x,(496-this.yInit)+y);
       this.append(daun,false);

    }


}
