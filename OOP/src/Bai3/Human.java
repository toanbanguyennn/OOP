package Bai3;

import java.io.Serializable;

public class Human implements Serializable {
    public int id;
    public String name;
    public String address;
    public int prioritized;

    public Human() {
    }

    public Human(int id, String name, String address, int prioritized) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.prioritized = prioritized;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrioritized() {
        return prioritized;
    }

    public void setPrioritized(int prioritized) {
        this.prioritized = prioritized;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", prioritized=" + prioritized +
                ',';
    }
}
