package com.plurasight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine().trim()));

        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine());

        CellPhone phone1 = new CellPhone();
        phone1.setSerialNumber(2597154);
        phone1.setModel("iPhone 15");
        phone1.setCarrier("Verizon");
        phone1.setPhoneNumber("888-555-5678");
        phone1.setOwner("Alex");

        display(phone);
        display(phone1);

        phone.dial(phone1.getPhoneNumber());
        phone1.dial(phone.getPhoneNumber());

        CellPhone phone2 = new CellPhone(
                2598353, "iPhone 18 Pro Max", "Verizon", "888-555-9012", "Suli");

        display(phone2);
        phone.dial(phone2.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.println("\nSerial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}