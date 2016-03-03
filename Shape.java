
/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    // instance variables - replace the example below with your own
    String shapeName;

    public Shape(String name){
        shapeName=name;
    }

    public abstract double area();    

    public String toString(){
        return shapeName;
    }

}
