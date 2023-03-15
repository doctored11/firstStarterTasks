import java.util.Locale;

import static java.lang.Math.sqrt;

public class Vector2D {
    double vX,vY;
     static int count;

    public Vector2D(){
        setCount();
        vX=1;
        vY=1;
    }
    public Vector2D(double   vX, double vY){
        setCount();

       this.vX=vX;
       this.vY = vY;
    }
    public Vector2D(Vector2D v){
        setCount();
        this.vX=v.vX;
        this.vY = v.vY;
    }
    void print(){
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", vX,vY));
    }
    void  add(Vector2D v){
        this.vX +=v.vX;
        this.vY+=v.vY;
    }
    void  sub(Vector2D v){
        this.vX -=v.vX;
        this.vY-=v.vY;
    }
    void scale(double scaleFactor){
        this.vX *=scaleFactor;
        this.vY *=scaleFactor;
    }

    public double length() {
        return Math.sqrt(vX*vX+vY*vY);
    }
    void  normalized(){
        double length = length();
        this.vX /=length;
        this.vY /=length;
    }
    double dotProduct(Vector2D v){
        return ( this.vX*v.vX+this.vY*v.vY);
    }

    public void setCount(){
        count++;
    }
}
