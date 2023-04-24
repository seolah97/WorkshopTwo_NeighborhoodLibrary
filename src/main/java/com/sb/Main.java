package com.sb;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner userScanner = new Scanner(System.in);

        Book[] bookArray = new Book[6];

        bookArray[1] = new Book(5864, "7851-3545", "Count of Monte Cristo", false, null);
        bookArray[2] = new Book(6284, "8495-5435", "Atomic Habits", false, null);
        bookArray[3] = new Book(8219, "4982-6489", "The Little Prince", false, null);
        bookArray[4] = new Book(3685, "8492-6429", "Harry Potter", false, null);
        bookArray[5] = new Book(2984, "6782-3462", "The Witches", false, null);

//        int totalNumOfBooks = bookArray.length;

        int commandInput;
        String userInput;

        do {
            System.out.println(
                    "Library Home Screen\n" +
                    "\t1 Display Available Books\n" +
                    "\t2 Display Checked Out Books\n" +
                    "\t3 Exit "
            );
            commandInput = userScanner.nextInt();




        } while (commandInput !=3);
    }
}




            //Display Available books




class Book{
        //Constructor
    public Book (int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = false;
            this.checkedOutTo = checkedOutTo;

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





}