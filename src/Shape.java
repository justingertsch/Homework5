/**
 * Created by Justin on 11/4/2014.
 */
abstract public class Shape
{
    public void setLocation()
    {
        System.out.print("setLocation in Shape");
    }

    public void getLocation()
    {
        System.out.print("getLocation in Shape");
    }

    abstract public void display();
    abstract public void fill();
    abstract public void setColor();
    abstract public void undisplay();


}
