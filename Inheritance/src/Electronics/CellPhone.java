
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
    public String toString() 
    {
        String msg;
        msg = "CellPhone{" + "phoneNumber=" + phoneNumber + ", hasCamera=" + hasCamera + '}';
        msg += super.toString();
        
        return msg;
    }//End toString

    public boolean takesPictures() 
    {
        return this.hasCamera;
    }//End takePictures
    
    @Override
    public void batteryType() 
    {
        System.out.println("This cellphone has battery");
    }// End batteryType()
}//End CellPhone
