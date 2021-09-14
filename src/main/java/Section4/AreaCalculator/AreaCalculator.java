package Section4.AreaCalculator;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(0.0));
        System.out.println(area(10,-5));

    }

    public static double area(double radius){
        if (radius < 0) {
            return -1;
        }
        double areaOfCircle = radius * radius * Math.PI;
        return areaOfCircle;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0) {
            return -1;
        }
        double areaOfRectangle = x * y;
        return areaOfRectangle;
    }
}
