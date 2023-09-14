
package Electronics;

/**
 *
 * @author huong
 */
public class AlarmClock extends Clock
{
    protected String alarmTime;

    public AlarmClock( String manufacturer, double price, double weight, String currentTime, String alarmTime) 
    {
        super(manufacturer, price, weight, currentTime);
        this.alarmTime = alarmTime;
    }//End constructor

    @Override
    public String room() 
    {
        return "This still have room for that";
    }//End room()
    
    public void setAlarmTime(String alarmTime) 
    {
        this.alarmTime = alarmTime;
    }//End setAlarmTime

    @Override
    public String toString() 
    {
        String msg;
        msg = "AlarmClock{" + "alarmTime=" + this.alarmTime + '}';
        msg += super.toString();
        
        return msg;
    }//End toString
}//End AlarmClock
