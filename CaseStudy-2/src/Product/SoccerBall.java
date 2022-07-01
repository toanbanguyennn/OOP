package Product;

public class SoccerBall extends Product {
    private int id;
    private String name;
    private int price;
    private int num;
    private String type;

    public SoccerBall() {
    }

    public SoccerBall(int id, String name, int price, int num, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SoccerBall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", type='" + type + '\'' +
                '}';
    }
}
