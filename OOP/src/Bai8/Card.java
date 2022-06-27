package Bai8;

public class Card {
    public Student student = new Student();
    public String dateNew;
    public String dateReturn;
    public int id;

    public Card() {
    }

    public Card(Student student, String dateNew, String dateReturn, int id) {
        this.student = student;
        this.dateNew = dateNew;
        this.dateReturn = dateReturn;
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDateNew() {
        return dateNew;
    }

    public void setDateNew(String dateNew) {
        this.dateNew = dateNew;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Card{" +
                "student=" + student +
                ", dateNew='" + dateNew + '\'' +
                ", dateReturn='" + dateReturn + '\'' +
                ", id=" + id +
                '}';
    }
}
