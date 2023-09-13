
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
    }//End 

    public String getManufacturer() 
    {
        return manufacturer;
    }//End getManufacturer

    public void setManufacturer(String manufacturer) 
    {
        this.manufacturer = manufacturer;
    }//End setManufacturer

    public double getPrice() 
    {
        return price;
    }//End getPrice

    public void setPrice(double price) 
    {
        this.price = price;
    }//End setPrice

    public double getWeight() 
    {
        return weight;
    }//End getWeight

    public void setWeight(double weight) 
    {
        this.weight = weight;
    }//End setWeight
}//End Electronics
