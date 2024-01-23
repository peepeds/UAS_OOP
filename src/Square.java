public class Square  extends Geometry{
    double width , height;
    int status ;
    double area ;

    protected Square(double width, double height, double status) { // default constructor
        this(1, 1,  1);
    }
    public  Square(double width , double height , int status){ // main constructor
        this.width = width ;
        this.height = height ;
        this.status  = status ;
        Area();
    }
    @Override
    public  void Area(){
        area = width * height ;
    }
}
