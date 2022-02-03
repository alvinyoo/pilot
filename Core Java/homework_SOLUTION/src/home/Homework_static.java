package com.interview.coding.course;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Also work as BookSeller Class
public class Homework_static {

    /**
     * 1)	Given a database table “Book” with columns (id, isbn, name, author, publish date),
     * define a java class that
     * matches this table and then use a static block to initialize this table with some records
     */
    public static List<Book> bookList = new ArrayList<>();
    static{
        bookList.add(new Book(1, "isbn1", "Java", "Me", new Date()));
        bookList.add(new Book(2, "isbn2", "Java", "Me", new Date()));
        bookList.add(new Book(3, "isbn3", "Java", "Me", new Date()));
    }


    public static class Book{
        private int id;
        private String isbn;
        private String name;
        private String author;
        private Date publishDate;


        public Book(){}

        public Book(int id, String isbn, String name, String author, Date publishDate) {
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            System.out.println("Warning! name is changed!");
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Date getPublishDate() {
            return publishDate;
        }

        public void setPublishDate(Date publishDate) {
            this.publishDate = publishDate;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", isbn='" + isbn + '\'' +
                    ", name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publishDate=" + publishDate +
                    '}';
        }
    }


    /**
     * 2)	Define a Java class “BookSeller” and then define a static inner class “Book”, and use a static method “sellBooks” to initialize several books,
     * and in the main method display all the books by calling the “sellBooks” method
     */

    public static List<Book> sellBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "isbn1", "Java", "Me", new Date()));
        bookList.add(new Book(2, "isbn2", "Java", "Me", new Date()));
        bookList.add(new Book(3, "isbn3", "Java", "Me", new Date()));
        return bookList;
    }

    public static void main(String[] args) {
        for(Book book : sellBooks()){
            System.out.println(book);
        }
    }
}
