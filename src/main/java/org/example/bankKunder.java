package org.example;

public class bankKunder {

    private String namn;
    private String adress;
    private String tel;
    private int saldo = 0;


    public bankKunder(String namn, String adress, String tel, int saldo) {
        this.namn = namn;
        this.adress = adress;
        this.tel = tel;
        this.saldo = saldo;
    }
    public String getNamn() {
        return namn;
    }
    public void setNamn(String namn) {
        this.namn = namn;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getKundInfo() {
        return "Namn: " + namn + "\nAdress: " + adress + "\nTel: " + tel + " \nSaldo: " + saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void deposit(int amount) {
        this.saldo += amount;
    }
    public void withdraw(int amount) {
        this.saldo -= amount;
    }


}
