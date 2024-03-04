package com.longfish.project.project4;

public class BookList {
    private final Book[] books;
    private int total;

    public BookList(int maxNumOfBook) {
        books = new Book[maxNumOfBook];
    }

    public Book getBook(int index) {
        if (index > total - 1) return null;
        else return books[index];
    }

    public Book[] getAllBook(){
        Book[] b = new Book[total];
        System.arraycopy(books, 0, b, 0, total);
        return b;
    }

    public void addBook(Book book){
        books[total++] = book;
    }

    public void replaceBook(int index,Book book){
        books[index] = book;
    }

    public void deleteBook(int index){
        if (total - 1 - index >= 0) System.arraycopy(books, index + 1, books, index, total - 1 - index);
        books[--total] = null;
    }

    public int getTotal(){
        return total;
    }

    public int getMax(){
        return books.length;
    }
}
