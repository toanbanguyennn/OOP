package Bai1;

import java.io.Serializable;

public class NhanVien extends CanBo implements Serializable {
private String Jop;

    public NhanVien(String name, int age, String gender, String jop) {
        super(name, age, gender);
        Jop = jop;
    }

    public String getJop() {
        return Jop;
    }

    public void setJop(String jop) {
        Jop = jop;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "Jop='" + Jop + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
