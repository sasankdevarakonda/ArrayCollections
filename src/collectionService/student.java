package collectionService;

/*public class student {
    String name;
    String country;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public student(String name, String country){
        this.name = name;
        this.country=country;

    }
}*/
public  class student {
    private String name;
    private String country;


    public void setCountry(String country) {
        this.country = country;
    }

    public student(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    @Override
    public String toString() {
        return "Name: "+name+"  "+"Country: "+country;
    }


}

