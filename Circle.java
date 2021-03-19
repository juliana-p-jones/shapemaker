package shapes;

public class Circle {


    //ivars - Global Variables
    private double radius;

    //Constructor same name as class
    public Circle(double radius){
        this.radius = radius;
    }

    //getter
    public double getRadius(){
        return radius;
    }

    //setter
    public void setRadius(double v){
        this.radius = radius;
    }

    //Method

    //Method
    public void calculateCirclePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println(perimeter);
    }
    public void calculateCircleArea() {
        double area = Math.PI * (radius * radius);
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
