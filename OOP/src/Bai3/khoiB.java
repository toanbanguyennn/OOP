package Bai3;

import java.io.Serializable;

public class khoiB extends Human implements Serializable {
    public khoiB(int id, String name, String address, int prioritized) {
        super(id, name, address, prioritized);
    }

    @Override
    public String toString() {
        return super.toString() +
                "khoi B : Toan , Hoa , Sinh" +
                '}';
    }
}
