
package Electronics;

/**
 *
 * @author huong
 */
public class AlarmClock extends Clock
{
    protected String alarmTime;

    public AlarmClock( String manufacturer, double price, double weight, String alarmTime, String currentTime) 
    {
        super(manufacturer, price, weight, currentTime);
        this.alarmTime = alarmTime;
    }//End constructor

    @Override
    public String room() 
    {
        System.out.println("This still have room for that");
        return null;
    }//End room()
    
    public void setAlarmTime(String alarmTime) 
    {
        this.alarmTime = alarmTime;
    }//End setAlarmTime

    @Override
    public String toString() 
    {
        String msg;
        msg = "AlarmClock{" + "alarmTime=" + alarmTime + '}';
        msg += super.toString();
        
        return msg;
    }//End toString
}//End AlarmClock
