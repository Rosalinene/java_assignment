
package Electronics;

/**
 *
 * @author huong
 */
public abstract class HomeAppliance extends Electronics
{

    public HomeAppliance(String manufacturer, double price, double weight) {
        super(manufacturer, price, weight);
    }

    public abstract void room();
}//End HomeAppliance
