package gilbertlauren.jwork_android;

public class Location {
    private String province;
    private String description;
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public String getCity() {
        return city;
    }

    public Location(String province, String city, String description) {
    }
}
