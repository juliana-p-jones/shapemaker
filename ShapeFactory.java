package shapes;
import org.w3c.dom.css.Rect;
public class ShapeFactory {
    public static void main(String[] args) {

        Triangle triangle = new Triangle (3.0, 4.0);

        triangle.setSide(69.0);

        System.out.println(triangle.getSide());



        System.out.println(triangle);

        System.out.println(triangle.calculateArea());

        //Circle

        Circle circle = new Circle(15);

        circle.setRadius(2.0);

        circle.calculateCirclePerimeter();

        System.out.println(circle.getRadius());




/*        Rectangle defaultRect = new Rectangle();
        System.out.println(defaultRect);
        defaultRect.calcArea();
        Rectangle colorFulRectangle = new Rectangle("RED",200,200);
       // colorfulRectangle.color = "PINK";
        //System.out.println(colorfulRectangle.getName(););

        System.out.println(colorFulRectangle);
        colorFulRectangle.calcArea();
        Rectangle.addObject("BLUE", 300, 100);*/

        // TRIANGLE AND CIRCLE CODE

/*
        Triangle defaultTriangle = new Triangle();
        System.out.println(defaultTriangle);

        Triangle

*/

    }

}

///Users/julianajones/IdeaProjects/Friday/src/main/java/shapes/ShapeFactory.java