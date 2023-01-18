package objects;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class GedungKosong extends Path2D.Double {

    public GedungKosong(int x, int y,int w, int h){
        Rectangle2D.Double kotak = new Rectangle2D.Double(x,y,w,h);
        this.append(kotak, false);
    }
}
