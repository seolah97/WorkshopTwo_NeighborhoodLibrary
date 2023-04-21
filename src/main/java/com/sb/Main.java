package com.sb;

public class Main {
    public static void main(String[] args) {

        // Make Book Class with Properties: Id-int, Isbn-String, Title- String, isCheckedOut-boolean, checkedOutTo-String
        //Methods:  checkOut(name) ,  checkIn()
        // Use Array to hold at least 5 books


    }

    class Book{
        //Constructor
        public Book (int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = isCheckedOut;
            this.checkedOutTo = checkedOutTo;

        }
        //id- Properties /Get n Set
        private int id;
        public int getId() {
            return id;}
        public void setId(int id) {
            id = id;}


        //isbn- Property/Construct./Get n Set
        private String isbn;
        public String getIsbn() {
            return this.isbn;}
        public void setIsbn(String isbn) {
            this.isbn = isbn;}

        //Title- Property/Construct./Get n Set
        private String title;
        public String getTitle() {
            return title;}
        public void setTitle(String title) {
            title = title;}

        //isCheckedOut- Property/Construct./Get n Set
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
}