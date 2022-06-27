package Bai1;

import java.io.Serializable;

public class KySu extends CanBo implements Serializable {
    private String Major;

    public KySu(String name, int age, String gender, String major) {
        super(name, age, gender);
        Major = major;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "Major='" + Major + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
