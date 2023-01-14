import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 * A class which creates listings and applies functions with them.
 * @author Onurcan Ataç
 * @version 03.05.2021
 */
public class Listing 
{
    // Properties
    String textbookName;
    double price;
    Course courseCode;
    String extraInformation;
    BufferedImage image;
    User seller;
    Location location;
    Status status;
    User buyer;
    
    // Constructors
    /**
     * Sets a Listing with a custom image in addition
     * @param textBookName name of the textbook
     * @param price price of the textbook
     * @param courseCode course code of the course which textbook is required for
     * @param extraInformation extra ingo about the textbook that user provides
     * @param Image image of the textbook
     * @param seller seller of the textbook
     * @param location location of the seller of the textbook
     */
    public Listing(String textBookName, double price, Course courseCode, String extraInformation, BufferedImage image, User seller)
    {
        this.textbookName = textBookName;
        this.price = price;
        this.courseCode = courseCode;
        this.extraInformation = extraInformation;
        this.image = image;
        this.seller = seller;
        this.location = seller.location;
        this.status = new Status();
    }
    
    /**
     * Sets a Listing with a default image
     * @param textBookName name of the textbook
     * @param price price of the textbook
     * @param courseCode course code of the course which textbook is required for
     * @param extraInformation extra ingo about the textbook that user provides
     * @param Image image of the textbook
     * @param seller seller of the textbook
     * @param location location of the seller of the textbook
     */
    public Listing(String textBookName, double price, Course courseCode, String extraInformation, User seller)
    {
        this.textbookName = textBookName;
        this.price = price;
        this.courseCode = courseCode;
        this.extraInformation = extraInformation;
        this.seller = seller;
        this.location = seller.location;
        try
        {
            this.image = ImageIO.read(new File("pictures/ItemPicture.png"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        

        this.status = new Status();
    }
    
    // Methods
    /**
     * Getter method for price of the textbook.
     * @return price 
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Setter method for price of the textbook.
     * @param newPrice the new price
     */
    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    /**
     * Getter method for the name of the textbook.
     * @return textbookname
     */
    public String getTextbookName()
    {
        return textbookName;
    }

    /**
     * Setter method for the name of the textbook.
     * @param newName the new name
     */
    public void setTextbookName(String newName)
    {
        this.textbookName = newName;
    }
    
    /**
     * Getter method for the status of the listing.
     * @return itemStatus
     */
    public Status getStatus()
    {
        return status;
    }
    
    /**
     * Setter method for the status of the listing.
     * @return itemStatus
     */
    public void setStatus(Status newStatus)
    {
        this.status = newStatus;
    }

    /**
     * Getter method for the course code which the textbook is required for.
     * @return courseCode
     */
    public Course getCourse()
    {
        return courseCode;
    }
    
    /**
     * Setter method for the course code which the textbook is required for.
     * @return courseCode
     */
    public void setCourse(Course newCourse)
    {
        this.courseCode = newCourse;;
    }

    /**
     * Getter method for the extra info about the textbook which is provided from the seller.
     * @return extraInformation
     */
    public String getExtraInformation()
    {
        return extraInformation;
    }

    /**
     * Setter method for the extra info about the textbook which is provided from the seller.
     * @param newInfo the new info
     */
    public void setExtraInformation(String newInfo)
    {
        extraInformation = newInfo;
    }

    /**
     * Getter method for the seller of the book.
     * @return seller
     */
    public User getSeller()
    {
        return seller;
    }

    //extra
    /**
     * Method for setting the buyer of the book.
     * @param buyer the buyer
     */
    public void setBuyer(User buyer)
    {
        this.buyer = buyer;
    }

    /**
     * Method for getting the image of the book.
     * @return image
     */
    public BufferedImage getImage()
    {
        return image;
    }

    /**
     * Method for setting the image of the book.
     * @param newImage the new image
     */
    public void setImage(BufferedImage newImage)
    {
        image = newImage;
    }

    /**
     * Method for getting the location of the book.
     * @return location
     */
    public Location getLocation()
    {
        return location;
    }

    //extra
    /**
     * Method for setting the location of the book.
     * @param newLocation the new location
     */
    public void setLocation(Location newLocation)
    {
        location = newLocation;
    }
}
