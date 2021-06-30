package gilbertlauren.jwork_android;
/**
 * Class Recruiter
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class Recruiter {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Recruiter constructor
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param location
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * getter id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setter id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter phone number
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * setter phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * getter location
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * setter Location
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }
}
