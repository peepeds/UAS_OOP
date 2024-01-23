import java.util.ArrayList;

public abstract class Geometry {
    double area;
    int status;

    protected abstract void Area();

    protected static void calculateTotalArea(ArrayList<Double> isColor, ArrayList<Double> notColor) {
        double colorTotal = 0;
        double notColorTotal = 0;

        for (int i = 0; i < isColor.size(); i++) colorTotal += isColor.get(i);
        for (int i = 0; i < notColor.size(); i++) notColorTotal += notColor.get(i);

        double grandTotal = colorTotal - notColorTotal;
        System.out.println("Color Area is " + colorTotal);
        System.out.println("Not Color Area is " + notColorTotal);
        System.out.println("Total Area is " + grandTotal);
    }
}
