/**
 * Created by Justin on 11/4/2014.
 */
public class AdapterCircle extends Shape
{

    private XXCircle c = null;

    public AdapterCircle(XXCircle c)
    {
        this.c = c;
    }

    public void setLocation()
    {
        this.c.setLocation();
    }

    public void getLocation()
    {
        this.c.getLocation();
    }

    public void display()
    {
        this.c.displayIt();
    }

    public void fill()
    {
        this.c.fillIt();
    }

    public void setColor()
    {
        this.c.setItsColor();
    }

    public void undisplay()
    {
        this.c.undisplayIt();
    }
}
