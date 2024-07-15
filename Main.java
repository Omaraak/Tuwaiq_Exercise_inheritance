public class Main {
    public static void main(String[] args) {

        //Shape
        System.out.println("Shape");

        Shape shape1 = new Shape();
        Shape shape2 = new Shape("black", false);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());

        //Shape setter and getter
        System.out.println("\nBefore:");
        System.out.println("color: " + shape1.getColor() + " filled: " + shape1.isFilled());

        shape1.setColor("red");
        shape1.setFilled(true);

        System.out.println("\nAfter:");
        System.out.println("color: " + shape1.getColor() + " filled: " + shape1.isFilled());

        //Circle
        System.out.println("\nCircle");

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(3,"white",true);

        //Circle to string
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());

        //Circle setter and getter
        System.out.println("\nBefore:");
        System.out.println("color: " + circle1.getColor() + " filled: " + circle1.isFilled() + " radius: " + circle1.getRadius());

        circle1.setColor("rainbow");
        circle1.setFilled(true);
        circle1.setRadius(15);

        System.out.println("After:");
        System.out.println("color: " + circle1.getColor() + " filled: " + circle1.isFilled() + " radius: " + circle1.getRadius());

        //Perimeter and area
        System.out.println("\nCircle 2 area = " + circle2.getArea());
        System.out.println("Circle 2 Perimeter = " + circle2.getPerimeter());

        //Rectangle
        System.out.println("\nRectangle");

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3,4);
        Rectangle rectangle3 = new Rectangle(2,8,"blue",false);

        //setter and getter
        System.out.println("\nBefore:");
        System.out.println("color: " + rectangle1.getColor() + " filled: " + rectangle1.isFilled() + " width: " + rectangle1.getWidth() + " length " + rectangle1.getLength());

        rectangle1.setColor("rainbow");
        rectangle1.setFilled(true);
        rectangle1.setWidth(15);
        rectangle1.setLength(10);

        System.out.println("After:");
        System.out.println("color: " + rectangle1.getColor() + " filled: " + rectangle1.isFilled() + " width: " + rectangle1.getWidth() + " length " + rectangle1.getLength());

        System.out.println("\n"+rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());


        //Perimeter and area
        System.out.println("\nRectangle 2 area = " + rectangle2.getArea());
        System.out.println("Rectangle 2 Perimeter = " + rectangle2.getPerimeter());

        //Square
        System.out.println("\nSquare");

        Square square1 = new Square();
        Square square2 = new Square(4);
        Square square3 = new Square(7,"mint",false);

        //getter and setter
        System.out.println("\nBefore:");
        System.out.println("color: " + square1.getColor() + " filled: " + square1.isFilled() + " width: " + square1.getWidth() + " length " + square1.getLength());

        square1.setColor("red");
        square1.setFilled(true);
        square1.setSide(8);

        System.out.println("after:");
        System.out.println("color: " + square1.getColor() + " filled: " + square1.isFilled() + " width: " + square1.getWidth() + " length " + square1.getLength());
        System.out.println();

        //to string
        System.out.println(square1.toString());
        System.out.println(square2.toString());
        System.out.println(square3.toString());

    }
}