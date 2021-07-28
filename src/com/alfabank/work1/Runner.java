package com.alfabank.work1;

import java.util.Scanner;

public class Runner {
    private Book[] collection;

    public void run() {
        // 1-1
        /* System.out.println(book1.getId() + " "
                + book1.getTitle() + " "
                + book1.getAuthor() + " "
                + book1.getPublisher() + " "
                + book1.getYear() + " "
                + book1.getPages() + " "
                + book1.getCost());*/

        // 1-2
        /* Book book1 = new Book();
        book1.view();
        book1.setId(1);
        book1.setAuthor("Tolstoy");
        book1.setYear(1857);
        book1.setCost(240.5);
        book1.view();*/

        //1-3
        /* Book book1 = new Book(1, "Voina i Mir", "Tolstoy", "Murzilka", 1875, 2850, 250.5);
        Book book2 = new Book(2, "Galaxy", "Discovery", "Discovery", 2020, 500);
        Book book3 = new Book(3, "Story", "Narodnaya", 1960);
        book1.view();
        book2.view();
        book3.view();*/

        //1-4
        createCollection();
        printBase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите процент, на который нужно изменить стоимость книг:");
        if (sc.hasNextInt()) {
            int percent = sc.nextInt();
            increaseCost(percent);
            System.out.println("\nРезультат изменения цены на " + percent + "%:");
            printBase();
        } else {
            System.out.println("Вы ввели не числовое значение.");
        }
    }

    public void createCollection() {
        collection = new Book[]{
                new Book(1, "Война и мир", "Толстой", "Мурзилка", 1875, 2850, 250.5),
                new Book(2, "Галактика", "Discovery", "Discovery", 2020, 500),
                new Book(3, "Истории", "Народная", 1960),
                new Book(4, "Звезды", "Discovery", "Discovery", 2018, 600),
                new Book(5, "Alians", "Vence", "Akka", 1987, 1400, 360.4),
                new Book(6, "Bests", "Arida", "Akka", 1999, 1000, 160),
                new Book(7, "Сказки", "Народная", 1981),
                new Book(8, "Мёртвый космос", "Карлос", "Виц", 2003, 900, 180.8)
        };
    }

    public Book [] findByAuthor (String author) {
        Book[] result = new Book[collection.length];
        for (int i=0; i < collection.length; i++) {
            if (collection[i].getAuthor().equalsIgnoreCase(author)) {
                result[i] = collection[i];
            }
        }
        return result;
    }

    public void printBase() {
        Book.printDivider();
        Book.printHeader();
        Book.printDivider();
        printCollection();
        Book.printDivider();
        System.out.println();
    }

    private void printCollection() {
        for (int i = 0; i < collection.length; i++) {
            collection[i].printBook();
        }
    }

    public Book[] getCollection() {
        return collection;
    }

    public void increaseCost(int percent) {
        for (int i = 0; i < collection.length; i++) {
            double newCost = collection[i].getCost() + (collection[i].getCost() * percent) / 100;
            newCost = (double) Math.round(newCost * 100) / 100;
            collection[i].setCost(newCost);
        }
    }
}
