
package Electronics;

/**
 *
 * @author huong
 */
public class Electronics 
{
    protected String manufacturer;
    protected double price;
    protected double weight;

    public Electronics(String manufacturer, double price, double weight) 
    {
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
    }//End constructor

    @Override
    public String toString() 
    {
        String msg;
        msg = "Electronics{" + "manufacturer=" + manufacturer + ", price=" + price + ", weight=" + weight + '}';
        //msg+= super.toString();
        
        return msg;
    }//End toString()
}//End Electronics
