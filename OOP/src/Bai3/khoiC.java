package Bai3;

import java.io.Serializable;

public class khoiC extends Human implements Serializable {
    public khoiC(int id, String name, String address, int prioritized) {
        super(id, name, address, prioritized);
    }

    @Override
    public String toString() {
        return super.toString() +
                "khoi C : Van, Su , Đia " +
                '}';
    }
}
