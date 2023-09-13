
package Electronics;

/**
 *
 * @author huong
 */
public class WallClock extends Clock
{
    public WallClock(String manufacturer, double price, double weight, String currentTime) 
    {
        super(manufacturer, price, weight, currentTime);
    }//End constructor

    @Override
    public String room() 
    {
        System.out.println("This still have room for that");
        return null;
    }//End room()
    
    @Override
    public String toString() 
    {
        String msg;
        msg = "WallClock{" + '}';
        msg += super.toString();
        
        return msg;
    }//End toString
}//End WallClock
