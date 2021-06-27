package com.book;

import java.util.ArrayList;
 import java.util.Scanner;

  public class AddressBook {
      //creating arraylist
      public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();
      public static Scanner sc = new Scanner(System.in);

      //main method
      public static void main(String[] args) {
          boolean options = true;
          while (options) {
              System.out.println("Enter \n 1)To Add contacts \n 2) To edit contacts\n 3)To Delete Contacts\n 4)to display the list 5)To Exit");
              System.out.println("Enter the option : ");
              int option = sc.nextInt();
              switch (option) {
                  case 1:
                      ///calling aadContacts method
                      AddressBook.addContacts();
                      break;
                  case 2:
                      //calling editContacts method
                      AddressBook.editContacts();
                      break;
                  case 3:
                      //calling deletingContacts method
                      AddressBook.deletingContacts();
                      break;
                  case 4:
                      ///calling displayContacts method
                      AddressBook.displayContacts();
                      break;
                  default:
                      System.out.println("Invalid Option");
              }

          }
      }
       //creating a method to display contacts
      private static void displayContacts() {
          for (Contacts c : contactsArrayList) {

          System.out.println(c);

      }
      }

      //creating a method for adding contacts
      static void addContacts() {
                  int choice = 0;
          while (choice == 0) {
              //creating object book
              Contacts book = new Contacts();


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

              //using console
              System.out.println(contactsArrayList.toString());
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
          System.out.println(contactsArrayList.get(0).getFirstName());
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



      //creating method for deleting contacts
      static void deletingContacts() {
          System.out.println("Enter firstname of the user you want to delete:");
          String firstName = sc.next();

          for (int i = 0; i < contactsArrayList.size(); i++) {
              Contacts c = contactsArrayList.get(i);
              if (c.getFirstName().equals(firstName)) {

                  contactsArrayList.remove(c);

              }
              System.out.println(contactsArrayList);


          }
          }
      }
