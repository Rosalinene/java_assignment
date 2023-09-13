
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
    
    @Override
    public void room() 
    {
        System.out.println("This still have room for that");
    }//End room()
}//End AlarmClock
