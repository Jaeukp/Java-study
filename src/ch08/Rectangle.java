package ch08;

public class Rectangle implements Shape, Drawble{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }



}
