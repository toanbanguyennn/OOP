package Bai1;

import java.io.Serializable;

public class CanBo implements Serializable {
    public String name;
    public int age;
    public String gender;

    public CanBo(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public CanBo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
