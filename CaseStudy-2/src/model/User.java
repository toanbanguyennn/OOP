package model;


public class User {
    private String name,phoneNumber,address,account,passwordUser;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public User(String name, String phoneNumber, String address, String account, String passwordUser) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.account = account;
        this.passwordUser = passwordUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", account='" + account + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                '}';
    }
}
