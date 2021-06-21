package com.epam.unit06.task03;

import java.util.ArrayList;

public class BookAggregator {
    private ArrayList<Book> collection;

    public BookAggregator() {
        collection = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        collection.add(book);
    }

    public String searchByAuthor(String author) {
        StringBuffer strBuffer = new StringBuffer("");
        collection.forEach(book -> {
            if (book.getAuthors() == author)
                strBuffer.append(book.toString());
        });
        return strBuffer.toString();
    }

    public String searchByYear(int year) {
        StringBuffer strBuffer = new StringBuffer("");
        collection.forEach(book -> {
            if (book.getYear() > year) strBuffer.append(book.toString());
        });
        return strBuffer.toString();
    }
}
