package model;

import java.util.ArrayList;

public class AccountAdmin {
    private String adminAccount;
    private String adminPassword;

    private final ArrayList<AccountAdmin> accountAdminList = new ArrayList<>();

    public AccountAdmin(String adminAccount, String adminPassword) {
        this.adminAccount = adminAccount;
        this.adminPassword = adminPassword;
    }

    public AccountAdmin() {
        accountAdminList.add(new AccountAdmin("Toan", "05111999"));
        accountAdminList.add(new AccountAdmin("admin", "123456"));
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public void addAccountAdmin(String adminAccount, String adminPassword){
        accountAdminList.add(new AccountAdmin(adminAccount, adminPassword));
    }
    public ArrayList<AccountAdmin> getAccountAdminList(){
        return accountAdminList;
    }

    @Override
    public String toString() {
        return "[ADMIN " + "Account = " + adminAccount + " Password = " + adminPassword + "]";
    }
}
