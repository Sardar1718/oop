public class Institution {
    private String name;
    private String city;

    public Institution(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void displayInfo() {
        System.out.println("Institution: " + name + ", City: " + city);
    }
}