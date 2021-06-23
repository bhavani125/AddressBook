package com.book;
 import java.util.Scanner;
  public class AddressBook {
    //main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // creating constructor
        Contacts book =new Contacts();

        System.out.println("Enter the firstName");
        book.setFirstName(sc.next());
        System.out.println("Enter the lastName");
        book.setLastName(sc.next());
        System.out.println("Enter the address");
        book.setAddress(sc.next());
        System.out.println("Enter the city");
        book.setCity(sc.next());
        System.out.println("Enter the state");
        book.setState(sc.next());
        System.out.println("Enter the emailId");
        book.setEmail(sc.next());
        System.out.println("Enter the phoneNumber");
        book.setPhoneNumber(sc.nextLong());
        System.out.println("Enter the zip");
        book.setZip(sc.nextLong());
    }
}

