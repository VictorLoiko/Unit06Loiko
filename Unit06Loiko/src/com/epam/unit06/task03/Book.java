package com.epam.unit06.task03;

public class Book {
    private int id;
    private String title;
    private String authors;
    private String publisher;
    private int year;
    private int pages;
    private double price;
    private String coverType;

    public Book(int id, String title, String authors, String publisher, int year, int pages, double price,
                String coverType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.coverType = coverType;
    }

    public Book(int id, String title, String authors, int year) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    public Book(String authors, int year) {
        this.authors = authors;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", title='" + title + '\'' + ", authors='" + authors + '\'' + ", publisher='" + publisher + '\'' + ", year=" + year + ", pages=" + pages + ", price=" + price + ", coverType='" + coverType + '\'' + '}' + '\n';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }
}
