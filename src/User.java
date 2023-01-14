import java.util.ArrayList;
import java.awt.image.BufferedImage;

/**
 * A class to create a User which can hold Listing objects
 * @author Arda Baktir
 * @author Bora Yilmaz
 * @version 03.05.2021
 */
public class User 
{
    // Propereties
    String phoneNumber;
    public String username;
    public String password;
    String mailAdress;
    int    securityQuestionNo;
    String securityQuestionAnswer;
    Location location;
    ArrayList<Listing> listings;
    
    // Constructors
    /**
     * Sets a new User which can hold Listing objects
     * @param mailAdress mail of the user
     * @param password of the user
     * @param securityQuestionNo security question code of the user
     * @param securityQuestionAnswer answer of the user to the given security question
     * @param cityNo city code of the user to determine Location
     */
    public User(String mailAdress, String password, int securityQuestionNo, String securityQuestionAnswer, int cityNo)
    {
        this.mailAdress = mailAdress;
        this.password   = password;
        this.securityQuestionNo     = securityQuestionNo;
        this.securityQuestionAnswer = securityQuestionAnswer;
        this.location = new Location(cityNo);
        phoneNumber = "";
        this.listings = new ArrayList<>();
        setUsername(mailAdress);
    }
    
    // Methods
    /**
     * @param textBookName name of the textbook
     * @param price price of the textbook
     * @param courseCode course code of the course which textbook is required for
     * @param extraInformation extra ingo about the textbook that user provides
     * @param Image image of the textbook
     * @param seller seller of the textbook
     * @param location location of the seller of the textbook
     */
    public void addNewListing(String textBookName, double price, Course courseCode, String extraInformation)
    {
        Listing newListing = new Listing(textBookName, price, courseCode, extraInformation, this);
        listings.add(newListing);
    }
    
    /**
     * Sets a new Listing with a custom image whose seller is this user and adds Listing to sellers listings ArrayList
     * @param textBookName name of the textbook
     * @param price price of the textbook
     * @param courseCode course code of the course which textbook is required for
     * @param extraInformation extra ingo about the textbook that user provides
     * @param location location of the seller of the textbook
     */
    public void addNewListing(String textBookName, double price, Course courseCode, String extraInformation, BufferedImage image)
    {
        Listing newListing = new Listing(textBookName, price, courseCode, extraInformation, image, this);
        listings.add(newListing);
    }

    /**
     * Setter for password
     * @param password Password to enter user accaount
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }

    /**
     * Sets the given city as the location for the user
     * @param location The desired location
     */
    public void setLocation(Location location) 
    {
        //in the future we could use a set location method for setting locations
        this.location = location;
    }

    /**
     * Sets the new mail address
     * @param mailAdress new mail address
     */
    public void setMailAdress(String mailAdress) 
    {
        this.mailAdress = mailAdress;
    }

    /**
     * The username is updated according to the mail address.
     * @param mailAdress mail adress to update username
     */
    public void setUsername(String mailAdress) 
    {
        int i = mailAdress.indexOf('@');
        username = mailAdress.substring(0,i);

    }

    /**
     * Setter for phone number
     * @param phoneNumber The phone number we would like to set to
     */
    public void setPhoneNumber(String phoneNumber)
     {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Returns phone number of User
     * @return phone number of User
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Returns email address of User
     * @return email address of User
     */
    public String getMailAdress()
    {
        return mailAdress;
    }
    
    /**
     * Returns username of User
     * @return username of User
     */
    public String getUsername()
    {
        return username;
    }
    
    /**
     * Returns password of User
     * @return password of User
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Returns security question number of User
     * @return security question number of User
     */
    public int getSecurityQuestionNo()
    {
        return securityQuestionNo;
    } 
    
    /**
     * Returns security question answer of User
     * @return security question answer of User
     */
    public String getSecurityQuestionAnswer()
    {
        return securityQuestionAnswer;
    }
    
    /**
     * Returns Location of User
     * @return Location of User
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Returns Listing ArrayList of User
     * @return Listing ArrayList of User
     */
    public ArrayList<Listing> getListings()
    {
        return listings;
    }
}
