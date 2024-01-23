public class Trapezoid extends Geometry {
    double upperWidth, lowerWidth, totalWidth;
    double height;
    int status;
    double area;

    protected Trapezoid(double upperWidth, double lowerWidth, double height) { // default constructor
        this(1, 1, 1, 1);
    }

    protected Trapezoid(double upperWidth, double lowerWidth, double height, int status) { // main coinstructor
        this.upperWidth = upperWidth;
        this.lowerWidth = lowerWidth;
        this.height = height;
        this.totalWidth = this.upperWidth + this.lowerWidth;
        this.status = status;
        Area();
    }

    @Override
    public void Area() {
        area = 0.5 * totalWidth * height;
    }
}
