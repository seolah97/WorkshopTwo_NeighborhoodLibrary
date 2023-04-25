package com.sb;
import java.util.Scanner;
public class Main {
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




class Book{
        //Constructor
    public Book (int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false;
            this.checkedOutTo = null;
        }

        //id- Properties /Get n Set
        public int id;
        public int getId() {
            return id;}
        public void setId(int id) {
            id = id;}


        //isbn- Properties/Get n Set
        private String isbn;
        public String getIsbn() {
            return this.isbn;}
        public void setIsbn(String isbn) {
            this.isbn = isbn;}

        //Title- Properties/Get n Set
        private String title;
        public String getTitle() {
            return title;}
        public void setTitle(String title) {
            title = title;}

        //isCheckedOut- Properties/Get n Set
        private boolean isCheckedOut;
        public boolean getIsCheckedOut() {
            return isCheckedOut;}
        public void setCheckedOut(boolean checkedOut) {
            isCheckedOut = checkedOut;}

        //checkedOutTo- Properties/Get n Set
        private String checkedOutTo;
        public String getCheckedOutTo() {
            return checkedOutTo;}
        public void setCheckedOutTo(String checkedOutTo) {
            this.checkedOutTo = checkedOutTo;}

    public void checkOut(String name){
        isCheckedOut = true;
        checkedOutTo = name;
        System.out.println(title + "  is checked out to " + checkedOutTo);
    }
};
//    public void checkIn(String name){
//        isCheckedOut=false;
//        checkedOutTo="";
//        System.out.println(title+" is available and ready to be checked out.");
//    }


//}