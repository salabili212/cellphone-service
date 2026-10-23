package com.plurasight;

public class main {
    public static void Main(String[] args) {

        CellPhone phone;
        phone = new CellPhone();

        //wor for second day
        //second cellphone object
        CellPhone phone1;
        phone1 = new CellPhone(2598353,"iPhone 18 Pro Max","Verizon", "888-555-1234","Suli");
        phone1.display();



        //Work for first day
        phone.setSerialNumber(2597153);
        phone.setModel("iPhone 15 Pro Max");
        phone.setCarrier("Verizon");
        phone.setPhoneNumber("888-555-1234");
        phone.setOwner("Sandra");

        //work for the first day
        System.out.println("\n\nFirst exercise.");
        System.out.println("What is the serial number? " + phone.getSerialNumber());
        System.out.println("What model is the phone ? "+ phone.getModel());
        System.out.println("Who is the carrier? "+ phone.getCarrier());
        System.out.println("What is the phone number?" + phone.getPhoneNumber());
        System.out.println("Who is the owner of the phone? "+ phone.getOwner());
    }
}
