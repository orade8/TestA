public class Rectangle extends Shape{
    private double length,width;

    public Rectangle(double l, double w){
        super("Rectangle");
        width=w;
        length=l;
    }

    public double area(){
        return length*width;
    }

    public String toString(){
        String s=super.toString()+" of length "+length+" and width "+width;
        return s;
    }
}