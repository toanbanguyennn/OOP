package Bai3;

import java.io.Serializable;

public class khoiA extends Human implements Serializable {
    public khoiA(int id, String name, String address, int prioritized) {
        super(id, name, address, prioritized);
    }

    @Override
    public String toString() {
        return super.toString() +
                "khoi A : Toan , Ly ,Hoa" +
                '}';
    }
}
