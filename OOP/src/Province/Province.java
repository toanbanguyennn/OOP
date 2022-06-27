package Province;

import java.io.Serializable;

public class Province implements Serializable {
    public String name;
    public double gdp;
    public int number;
    public double area;
    public Country country;

    public Province() {
    }

    public Province(String name, double gdp, int number, double area, Country country) {
        this.name = name;
        this.gdp = gdp;
        this.number = number;
        this.area = area;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", gdp=" + gdp +
                ", number=" + number +
                ", area=" + area +
                ", country=" + country +
                '}';
    }
}
