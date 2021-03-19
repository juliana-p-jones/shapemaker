package shapes;

public class Triangle {


    //ivars - Global Variables
    private double side;
    private double base;

    //Constructor same name as class
    public Triangle(double side, double base){
        this.side = side;
        this.base = base;
    }

    //getter
    public double getSide(){
        return side;
    }
    //setter
    public void setSide(double side){
        this.side = side;
    }
    //getter
    public double getBase(){
        return base;
    }
    //setter
    public void setBase(double base){
        this.base = base;
    }


    //Method
    public void calculatePerimeter() {
        double perimeter = side + base + side;
        System.out.println(perimeter);
    }

    //Method number two
    public double calculateArea(){
    double area =  side * base / 2;
        System.out.println("This is the area: " + area);
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", base=" + base +
                '}';
    }
}











    /*public Triangle() {
        this(40, 50);
    }

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
        //Overloaded constructor
    public Triangle(String color, int width, int height){
            this.color = color;
            this.width = width;
            this.height = height;
        }


        //this variable is PRIVATE!!
        private String name;


        //Getter
        public String getName () {
            return name;
        }
        //Setter
        public void setName (String name){
            this.name = name;


        }



    //Method
    public void calcAreaTriangle(){
        System.out.println(.5 * (this.width * this.height));

        }
    public void calcPerimeterTriangle(){
        System.out.println(sideA + sideB + sideC);
*/
