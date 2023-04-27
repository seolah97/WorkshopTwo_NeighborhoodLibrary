package com.sb;
import java.util.Scanner;
public class NeighborhoodLibrary {
    public static void main(String[] args){
        Scanner userScanner = new Scanner(System.in);

        Book[] bookArray = new Book[5];

        bookArray[0] = new Book(5864, "7851-3545", "Count of Monte Cristo", false, null);
        bookArray[1] = new Book(6284, "8495-5435", "Atomic Habits", false, null);
        bookArray[2] = new Book(8219, "4982-6489", "The Little Prince", false, null);
        bookArray[3] = new Book(3685, "8492-6429", "Harry Potter", false, null);
        bookArray[4] = new Book(2984, "6782-3462", "The Witches", false, null);

//        int totalNumOfBooks = bookArray.length;

        int commandInput;
        String userInput;
        // Displays the 3 options for Library user
        do {
            System.out.println(
                    "Library Home Screen\n" +
                            "\t1 Display Available Books\n" +
                            "\t2 Display Checked Out Books\n" +
                            "\tC Check In a Book\n" +
                            "\t3 Exit\n" + "Choose what you would like to do: "
            );
            commandInput = userScanner.nextInt();

            // Show Available Books: Needs to show books, Prompt book to check out-> name, or exit
            switch(commandInput){
                case 1: //shows List of books for user
                    System.out.println("List of Available Books");
                    for(int i = 0; i < bookArray.length; i++) {
                        if (bookArray[i] == null) {
                            break; //Will not list available list without a break
                        }

                        if (!bookArray[i].getIsCheckedOut()) {
                            System.out.printf("\tId: %d, Isbn: %s, Title: %s\n",
                                    bookArray[i].getId(),
                                    bookArray[i].getIsbn(),
                                    bookArray[i].getTitle()
                            );
                        }
//            System.out.println("Please enter the ID of the book to check out: ");
//            int Id = userScanner.nextInt();
//            for (int i =0; i < bookArray.length; i++) {
//                if (bookArray[i]. getid() == id) {
//                    if (bookArray[i].getIsCheckedOut());
//            }



                    }

            }

        } while (commandInput !=3);
    }
}

