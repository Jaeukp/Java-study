package ch08;

public class Square implements Shape {
    private double side;

    public Square(double side){
        this.side= side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }


}
