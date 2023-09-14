
package Electronics;

/**
 *
 * @author huong
 */
public abstract class PortableElectronics extends Electronics
{
    public PortableElectronics(String manufacturer, double price, double weight) 
    {
        super(manufacturer, price, weight);
    }//End constructor
    
    public abstract String batteryType(); //Abstract batteryType()
}//End PortableElectronics 
