
/**
 * Test class for Location
 * @author Bora Yilmaz
 */
public class LocationTest 
{
    public static void main(String[] args)
    {
        Location myLocation = new Location(6);
        
        for (int i = 0; i < 82; i++)
        {
            myLocation.setCityNo(i);
            System.out.println(myLocation.getCityNo() + " - " + myLocation);
        }
    }
}
