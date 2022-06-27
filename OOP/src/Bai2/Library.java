package Bai2;

public class Library {
    public int code;
    public String imprint;// tên nhà xuất bản
    public int num;

    public Library() {
    }

    public Library(int code, String imprint, int num) {
        this.code = code;
        this.imprint = imprint;
        this.num = num;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Library{" +
                "code=" + code +
                ", imprint='" + imprint + '\'' +
                ", num=" + num +
                '}';
    }
}
