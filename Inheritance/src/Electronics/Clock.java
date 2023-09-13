
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
        msg = "Clock{" + "currentTime=" + currentTime + '}';
        msg += super.toString();
        
        return msg;
    }//End toString

    @Override
    public void room() 
    {
        System.out.println("This still have room for that");
    }//End room()
    
}//End Clock
