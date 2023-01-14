/**
 * A class to determine User and Listing locations
 * @author Bora Yilmaz
 * @version 01.05.2021
 */
public class Location 
{
    public final String[] CITY_NAMES = {
        "Abroad","Adana","Adıyaman","Afyon","Ağrı","Amasya","Ankara","Antalya","Artvin",
        "Aydın","Balıkesir","Bilecik","Bingöl","Bitlis","Bolu","Burdur","Bursa","Çanakkale",
        "Çankırı","Çorum","Denizli","Diyarbakır","Edirne","Elazığ","Erzincan","Erzurum",
        "Eskişehir","Gaziantep","Giresun","Gümüşhane","Hakkari","Hatay","Isparta","Mersin",
        "İstanbul","İzmir","Kars","Kastamonu","Kayseri","Kırklareli","Kırşehir","Kocaeli",
        "Konya","Kütahya","Malatya","Manisa","Kahramanmaraş","Mardin","Muğla","Muş","Nevşehir",
        "Niğde","Ordu","Rize","Sakarya","Samsun","Siirt","Sinop","Sivas","Tekirdağ","Tokat",
        "Trabzon","Tunceli","Şanlıurfa","Uşak","Van","Yozgat","Zonguldak","Aksaray","Bayburt",
        "Karaman","Kırıkkale","Batman","Şırnak","Bartın","Ardahan","Iğdır","Yalova","Karabük",
        "Kilis","Osmaniye","Düzce"
    };
    private int cityNo;
    
    /**
     * Gets an integer value and creates a Location object if input value refers 
     * to a city's code. 0 refers to other cities abroad.
     * @param cityNo city's code
     */
    public Location(int cityNo)
    {
        if (cityNo < 0 || cityNo >= CITY_NAMES.length)
        {
            throw new IllegalArgumentException("This code does not belong to a city");
        }
        
        this.cityNo = cityNo;
    }
    
    /**
     * Sets a new city code according to input
     * @param newCityNo new city code for Location
     */
    public void setCityNo(int newCityNo)
    {
        if (newCityNo < 0 || newCityNo >= CITY_NAMES.length)
        {
            throw new IllegalArgumentException("This code does not belong to a city");
        }
        
        cityNo = newCityNo;
    }
    
    /**
     * Returns the current city code
     * @return the current city code
     */
    public int getCityNo()
    {
        return cityNo;
    }
    
    /**
     * Returns the name of the city according to city code. Returns "Abroad"
     * as a city name if city code is 0.
     * @return name of the city
     */
    @Override
    public String toString()
    {
        return CITY_NAMES[cityNo];
    }
    
    /**
     * Returns an Array of Strings which has city names
     * @return an Array of Strings which has city names
     */
    public String[] getCities()
    {
        return CITY_NAMES;
    }
}