package com.book;

import java.util.ArrayList;
 import java.util.Scanner;

  public class AddressBook {
      public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();
      public static Scanner sc = new Scanner(System.in);

      //main method
      public static void main(String[] args) {
          boolean options = true;
          while (options) {
              System.out.println("Enter \n 1)To Add contacts \n 2) To edit contacts\n 3) To Exit");
              System.out.println("Enter the option : ");
              int option = sc.nextInt();
              switch (option) {
                  case 1:
                      AddressBook.addContacts();
                      break;
                  case 2:
                      AddressBook.editContacts();
                      break;
                  default:
                      System.out.println("Invalid Option");
              }

          }
      }

      //creating a method for adding contacts
      static void addContacts() {
          Contacts book = new Contacts();
          int choice = 0;
          while (choice == 0) {
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

              //calling toString
              System.out.println(book.toString());
              contactsArrayList.add(book);

              System.out.println("Enter\n 1) To add Another contact \n 0) To exit\n");
              int number = sc.nextInt();
              if (number == 0) {
                  choice = 1;

              }
          }
      }

      //creating method for editing contacts
      static void editContacts() {


          System.out.println("Enter firstname of the user you want to the edit:");
          String firstName = sc.next();
          for (Contacts c : contactsArrayList) {
              if (c.getFirstName().equals(firstName)) {

                  System.out.println("c");
                  System.out.println("Enter the  field which u want to edit:");

                  System.out.println(" Address");
                  System.out.println(" City ");
                  System.out.println(" State");
                  System.out.println(" Email");
                  System.out.println(" Phone Number");
                  System.out.println(" ZipCode");
                  System.out.println("Enter");
                  String field = sc.next();
                  if (field.equals("firstName")) {
                      c.setFirstName(sc.next());
                  } else if (field.equals("lastName")) {
                      c.setLastName(sc.next());
                  } else if (field.equals("Address")) {
                      c.setAddress(sc.next());
                  } else if (field.equals("City")) {
                      c.setCity(sc.next());
                  } else if (field.equals("State")) {
                      c.setState(sc.next());
                  } else if (field.equals("Email")) {
                      c.setEmail(sc.next());
                  } else if (field.equals("phoneNumber")) {
                      c.setPhoneNumber(sc.nextLong());
                  } else if (field.equals("Zip")) {
                      c.setZip(sc.nextLong());
                  }
              }

              }
          System.out.println(contactsArrayList.toString());

          }
      }











