public class Triangle extends Geometry {
    double height, width;
    int status;
    double area;

    protected Triangle(double height, double width) { // default constructor
        this(1, 1, 1);
    }

    protected Triangle(double height, double width, int status) { // main constructor
        this.height = height;
        this.width = width;
        this.status = status;
        Area();
    }

    @Override
    public void Area() {
        area = 0.5 * height * width;
    }
}
