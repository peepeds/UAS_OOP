import  java.lang.Math ;
public class Circle  extends Geometry{
     double pi = Math.PI ;
    double radius ;
    double area ;
    int status ;

    protected Circle(double width, double status) { // default constructor
        this(1, 1);
    }
    protected   Circle(double width , int status) { // main constructor
        this.radius = width ;
        this.status = status ;
        Area();
    }

    @Override
    public void Area(){
        area = pi * Math.pow(radius , 2) ;
    }
}
