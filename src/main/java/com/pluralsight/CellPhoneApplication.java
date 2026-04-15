package com.pluralsight;

public class CellPhoneApplication {
    public void main(){
        CellPhone phone = new CellPhone();
        CellPhone phone2 = new CellPhone();
        int Bread = 2;
        int PRICE = 0;
        double PRICE2 = 4.99;
        String name = "Oscar";
        CellPhone Phone3 = new CellPhone();
        Phone3.owner = "Oscar";
        System.out.println(Phone3.getModel());
        Phone3.setModel("Iphone");
        System.out.println(Phone3.getModel());
        System.out.println(Phone3.getserialNumber());
        System.out.println(Phone3.getCarrier());
        System.out.println(Phone3.getphoneNumber());




    }
}
