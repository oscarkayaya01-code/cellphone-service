package com.pluralsight;

public class CellPhone {
    private int serialNumber = 0;
    private String model="t" ;
    private String Carrier = "ATT";
    private String phoneNumber = "206 334-4596";
    public String owner = "";

    public void setModel(String model){
        this.model = model;

    }
    public String getModel(){
        return this.model;

    }
    public int getserialNumber(){
        return this.serialNumber;
    }
    public void setserialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getCarrier(){
        return this.Carrier;
    }
    public void setCarrier(String Carrier){
        this.Carrier = Carrier;
    }
    public String getphoneNumber(){
        return this.phoneNumber;

    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}
