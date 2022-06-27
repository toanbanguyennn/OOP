package Bai1;

import java.io.Serializable;

public class CongNhan extends CanBo implements Serializable {
  private int Bac;

  public CongNhan(String name, int age, String gender, int bac) {
    super(name, age, gender);
    Bac = bac;
  }

  public int getBac() {
    return Bac;
  }

  public void setBac(int bac) {
    Bac = bac;
  }

  @Override
  public String toString() {
    return "CongNhan{" +
            "Bac=" + Bac +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            '}';
  }
}
