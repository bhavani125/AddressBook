package com.book;

import java.util.ArrayList;
 import java.util.Scanner;

  public class AddressBook{

         public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();
        //main method
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

          // creating constructor
          Contacts book = new Contacts();

               //local variable
            int choice=0;

            while(choice==0) {

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

              System.out.println("Enter 1 add to another contact or Enter 0 to exit");
              int number= sc.nextInt();
              if(number==0) {
                  choice=1;
              }
          }
      }
  }


