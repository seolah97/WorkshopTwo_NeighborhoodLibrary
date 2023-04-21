package com.sb;

public class Main {
    public static void main(String[] args) {

        // Make Book Class with Properties: Id-int, Isbn-String, Title- String, isCheckedOut-boolean, checkedOutTo-String
        //Methods:  checkOut(name) ,  checkIn()
        // Use Array to hold at least 5 books


    }

    class Book{
        //Id- Property/Construct./Get n Set
        private int Id;
        public int getId() {
            return Id;}

        public void setId(int id) {
            Id = id;}

        public Book() {}
        public Book(int id) {
            Id = id;}

        //Isbn- Property/Construct./Get n Set
        private String Isbn;
        public Book(String isbn) {
            Isbn = isbn;}
        public String getIsbn() {
            return Isbn;}

        public void setIsbn(String isbn) {
            Isbn = isbn;}

        //Title- Property/Construct./Get n Set
        private String Title;
        public String getTitle() {
            return Title;}

        public void setTitle(String title) {
            Title = title;}

        //isCheckedOut- Property/Construct./Get n Set
        public Book(boolean isCheckedOut) {

            this.isCheckedOut = isCheckedOut;}

        public boolean isCheckedOut() {
            return isCheckedOut;}

        public void setCheckedOut(boolean checkedOut) {
            isCheckedOut = checkedOut;}

        private boolean isCheckedOut;

        //checkedOutTo- Property/Construct./Get n Set
        private String checkedOutTo;
        public String getCheckedOutTo() {
            return checkedOutTo;}

        public void setCheckedOutTo(String checkedOutTo) {
            this.checkedOutTo = checkedOutTo;}




    }
}