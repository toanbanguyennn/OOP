package Bai8;

public class Student {
    public String name;
    public int age;
    public String classes;

    public Student() {
    }

    public Student(String name, int age, String classes) {
        this.name = name;
        this.age = age;
        this.classes = classes;
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

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
