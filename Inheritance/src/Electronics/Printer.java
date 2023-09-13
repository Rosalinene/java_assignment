
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

    public boolean printerStatus() {
        return this.paperLoaded && this.inkLoaded;
    }

   @Override
    public void room() 
    {
        System.out.println("This still have room for that");
    }//End room()
}//End Printer
