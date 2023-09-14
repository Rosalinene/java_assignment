
package Electronics;

/**
 *
 * @author huong
 */
public class CellPhone extends PortableElectronics
{
    protected String phoneNumber;
    protected boolean hasCamera;

    public CellPhone(String manufacturer, double price, double weight, String phoneNumber, boolean hasCamera) 
    {
        super(manufacturer, price, weight);
        this.phoneNumber = phoneNumber;
        this.hasCamera = hasCamera;
    }//End constructor

    @Override
    public String batteryType() 
    {  
        return "This cellphone has battery";
    }// End batteryType()
    
    public String number()
    {
        return this.phoneNumber;
    }//End number()
    
     public boolean takesPictures() 
    {
        return this.hasCamera;
    }//End takePictures
     
    @Override
    public String toString() 
    {
        String msg;
        msg = "CellPhone{" + "phoneNumber=" + this.phoneNumber + ", hasCamera=" + this.hasCamera + '}';
        msg += super.toString();
        
        return msg;
    }//End toString   
}//End CellPhone
