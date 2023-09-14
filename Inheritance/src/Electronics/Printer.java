
package Electronics;

/**
 *
 * @author huong
 */
public class Printer extends HomeAppliance
{
    private int dotsPerInch;
    private boolean paperLoaded;
    private boolean inkLoaded;

    public Printer(String manufacturer, double price, double weight, int dotsPerInch, boolean paperLoaded, boolean inkLoaded) 
    {
        super(manufacturer, price, weight);
        this.dotsPerInch = dotsPerInch;
        this.paperLoaded = paperLoaded;
        this.inkLoaded = inkLoaded;
    }//End constructor

    public boolean printerStatus() 
    {
        return this.paperLoaded && this.inkLoaded;
    }//End printerStatus()

   @Override
    public String room() 
    {
        return "This still have room for that";
    }//End room()

    @Override
    public String toString() 
    {
        String msg;
        msg = "Printer{" + "dotsPerInch=" + this.dotsPerInch + ", paperLoaded=" + this.paperLoaded + ", inkLoaded=" + this.inkLoaded + '}';
        msg += super.toString();
        
        return msg;
    }//End toString
    
    
}//End Printer
