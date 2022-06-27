package Province;

public class Country {
    public String name1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Country() {
    }

    public Country(String name1) {
        this.name1 = name1;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name1='" + name1 + '\'' +
                '}';
    }
}
