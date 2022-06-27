package Bai9;

import java.io.Serializable;

public class Receipt implements Serializable {
    public Client client = new Client();
    public double codeOld;
    public double codeNew;

    public Receipt(Client client, double codeOld, double codeNew, double money) {
        this.client = client;
        this.codeOld = codeOld;
        this.codeNew = codeNew;
        this.money = money;
    }

    public double money;

    public Receipt() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getCodeOld() {
        return codeOld;
    }

    public void setCodeOld(double codeOld) {
        this.codeOld = codeOld;
    }

    public double getCodeNew() {
        return codeNew;
    }

    public void setCodeNew(double codeNew) {
        this.codeNew = codeNew;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "client=" + client +
                ", codeOld=" + codeOld +
                ", codeNew=" + codeNew +
                ", money=" + money +
                '}';
    }
}
