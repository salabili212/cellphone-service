package com.plurasight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;



    public CellPhone(){
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    //first day work
    //overload constructor
    public CellPhone(int serialNumber,String model, String carrier, String phoneNumber,String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    //Display method
    void display(){
        System.out.println("Second exercise");
        System.out.println("What is the serial number?" + serialNumber);
        System.out.println("What model is the phone ? " + model);
        System.out.println("Who is the carrier? " + carrier);
        System.out.println("What is the phone number? " + phoneNumber);
        System.out.println("Who is the owner of the phone? " + owner);
    }

    //frist day work
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    //getters
    public int getSerialNumber(){
        return serialNumber;
    }

    public String getModel(){
        return model;
    }
    public String getCarrier(){
        return carrier;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getOwner(){
        return owner;
    }





}
