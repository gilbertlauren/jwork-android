package gilbertlauren.jwork_android;
/**
 * Class Location
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class Location {
    private String province;
    private String description;
    private String city;

    /**
     * constructor location
     * @param province
     * @param city
     * @param description
     */
    public Location(String province, String city, String description){
        this.province = province;
        this.description = description;
        this.city = city;
    }

    /**
     * getter province
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * setter for province
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * getter description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getter city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * setter city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }
}