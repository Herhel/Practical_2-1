package com.alfabank.work1;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double cost;

    public Book(int id, String title, String author, String publisher, int year, int pages, double cost) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
    }

    public Book(int id, String title, String author, String publisher, int year, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
    }

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = "";
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static void printHeader () {
        System.out.printf("%4s %-20s %-16s %-12s %6s %7s %9s%n", "№", "Название", "Автор", "Издание", "Год", "Стр.", "Цена");
    }

    public static void printDivider() {
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void printBook() {
        System.out.printf("%4s %-20s %-16s %-12s %6s %7s %9.2f%n", id, title, author, publisher, year, pages, cost);
    }
}
