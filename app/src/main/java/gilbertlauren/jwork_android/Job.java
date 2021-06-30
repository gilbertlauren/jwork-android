package gilbertlauren.jwork_android;
/**
 * Class Job
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class Job {
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private String category;

    /**
     * Job Constructor
     * @param id
     * @param name
     * @param recruiter
     * @param fee
     * @param category
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category) {
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    /**
     * Getter for Id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setter for id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for recruiter
     * @return recruiter
     */
    public Recruiter getRecruiter() {
        return recruiter;
    }

    /**
     * Setter for recruiter
     * @param recruiter
     */
    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }

    /**
     * Getter for fee
     * @return fee
     */
    public int getFee() {
        return fee;
    }

    /**
     * setter for fee
     * @param fee
     */
    public void setFee(int fee) {
        this.fee = fee;
    }

    /**
     * getter for category
     * @return category
     */
    public String getCategory() {
        return category;
    }
}
