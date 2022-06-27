package Bai9;

import java.io.Serializable;

public class Client implements Serializable {
    public String name;
    public int address;
    public double id;

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Client(String name, int address, double id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", id=" + id +
                ' ';
    }
}
