
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
        return "This still have room for that";
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
