package com.epam.unit06.task03;

public class Main3 {
    public static void main(String[] args){
        BookAggregator library = new BookAggregator();
        library.addBook(new Book(1, "title", "authors1", "publisher", 1956, 674, 158.24,"hard"));
        library.addBook(new Book(2, "title", "authors2", "publisher", 2011, 425, 154.33,"soft"));
        library.addBook(new Book(3, "title", "authors3", "publisher", 1976, 453, 54674.43,"hard"));
        library.addBook(new Book(4, "title", "authors3", "publisher", 1957, 42324, 678.43,"soft"));
        library.addBook(new Book(5, "title", "authors4", "publisher", 2021, 694, 23.5,"soft"));

        System.out.println("Ищем по автору 'authors3'");
        System.out.println(library.searchByAuthor("authors3"));
        System.out.println("Ищем книги старше 2000 года");
        System.out.println(library.searchByYear(2000));
    }
}
