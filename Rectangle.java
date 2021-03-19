package shapes;
public class Rectangle {
    //ivars - Global Variables
    public String color;
    public int width;
    public int height;

    //this variable is PRIVATE!!
    private String name;


    //Getter
    public String getName(){
        return name;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }

    public Rectangle(){
        this(40,50);
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    //Overloaded constructor
    public Rectangle (String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }
    //Method
    public void calcArea(){
        System.out.println(this.width * this.height);
    }
    public static void addObject(String color, int xAxis, int yAxis ){
        System.out.println("Added a " + color + " rectangle  to position " + xAxis + " on the xAxis" + " and to position " + yAxis + " on the yAxis");
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}