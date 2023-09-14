
package Electronics;

/**
 *
 * @author huong
 */
public class Clock extends HomeAppliance
{
    protected String currentTime;

    public Clock(String manufacturer, double price, double weight, String currentTime) 
    {
        super(manufacturer, price, weight);
        this.currentTime = currentTime;
    }//End constructor

    @Override
    public String room() 
    {
        return "This still have room for that";
    }//End room()
    
    public String getCurrentTime() 
    {
        return currentTime;
    }//End getCurrentTime

    public void setCurrentTime(String currentTime) 
    {
        this.currentTime = currentTime;
    }//End setCurrentTime

    @Override
    public String toString() 
    {
        String msg;
        msg = "Clock{" + "currentTime=" + this.currentTime + '}';
        msg += super.toString();
        
        return msg;
    }//End toString
}//End Clock
