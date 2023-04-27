package com.sb;

public class Book {
   // Properties
    public int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //Constructor
    public Book (int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = null;
    }

    //id- Get n Set
    public int getId() {
        return id;}
    public void setId(int id) {
        id = id;}

    //isbn- Get n Set
    public String getIsbn() {
        return this.isbn;}
    public void setIsbn(String isbn) {
        this.isbn = isbn;}

    //Title- Get n Set
    public String getTitle() {
        return title;}
    public void setTitle(String title) {
        title = title;}

    //isCheckedOut- Get n Set
    public boolean getIsCheckedOut() {
        return isCheckedOut;}
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;}

    //checkedOutTo- Get n Set

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




