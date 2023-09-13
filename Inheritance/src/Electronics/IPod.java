
package Electronics;

/**
 *
 * @author huong
 */
public class IPod extends PortableElectronics
{
    protected int capacity;
    protected String type;

    public IPod(String manufacturer, double price, double weight, int capacity, String type) 
    {
        super(manufacturer, price, weight);
        this.capacity = capacity;
        this.type = type;
    }//End constructor
    
    @Override
    public String batteryType() 
    {
        System.out.println("This ipod has battery");
        return null;
    }// End batteryType()

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }//End setCapacity
    
    public void setType(String type) 
    {
        this.type = type;
    }//End setType

    @Override
    public String toString() 
    {
        String msg;
        msg = "IPod{" + "capacity=" + capacity + ", type=" + type + '}';
        msg += super.toString();
    
        return msg;
    }//End toString

    
  
}//End IPod
