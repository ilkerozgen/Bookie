/**
 * A class that represents the status of the textbook.
 * @author İlker Özgen
 * @version 01.05.2021
*/
public class Status
{
    // Properties
    private final String[] STATUS_CODES = {"On sale", "Pending", "Sold"};
    private int statusNumber;

    // Constructors
    /**
     * Sets the default status number 0, which represents "On sale"
     */
    public Status()
    {
        this.statusNumber = 0;
    }
    
    /**
     * Sets the default status number parameter
     * @param statusNumber number to determine status
     */
    public Status(int statusNumber)
    {
        if (statusNumber < 0 || statusNumber >= STATUS_CODES.length)
        {
            throw new IllegalArgumentException("Invalid status");
        }
        
        this.statusNumber = statusNumber;
    }
    
    // Methods
    /**
     * A getter method to get status number.
     * @return status number
     */
    public int getStatusNumber()
    {
        return statusNumber;
    }

    /**
     * A setter method to set a new status.
     * @param statusNumber the new status numbers
     */
    public void setStatusNumber( int statusNumber )
    {
        this.statusNumber = statusNumber;
    }
    
    /**
     * Returns an Array of Strings that holds String representations of Status codes.
     * @return an Array of Strings that holds String representations of Status codes.
     */
    public String[] getStatusCodes()
    {
        return STATUS_CODES;
    }
    
    @Override
    /**
     * Returns String representation of Status code
     * @return String representation of Status code
     */
    public String toString()
    {
        return STATUS_CODES[statusNumber];
    }
}