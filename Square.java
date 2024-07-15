public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide(){
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side= " + super.getWidth() + ", which is a subclass of Rectangle";
    }
}
