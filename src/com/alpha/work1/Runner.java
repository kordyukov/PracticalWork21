package com.alpha.work1;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public void run() {

        Runner runner = new Runner();

        runner.ReadBook(runner.CreateBook());

        Book[] book = runner.PlusCountBook(runner.CreateBook());
        System.out.println("Увеличена цена на 10% :");
        runner.ReadBook(book);
        runner.ReadBook(runner.SpisokAutor(book));


    }


    public Book[] CreateBook() {
        return new Book[]{new Book(1, "Name1", "Autor1", "publisher1",
                2000, 50, 100),
                new Book(2, "Name2", "Autor2", "publisher2",
                        2001, 51, 101),
                new Book(3, "Name3", "Autor1", "publisher3",
                        2002, 52, 102),
                new Book(4, "Name4", "Autor4", "publisher4",
                        2003, 53, 103),
                new Book(5, "Name5", "Autor5", "publisher5",
                        2004, 54, 104),
                new Book(6, "Name6", "Autor1", "publisher6",
                        2005, 55, 105),
                new Book(7, "Name7", "Autor7", "publisher7",
                        2006, 56, 106),

        };
    }

    public void ReadBook(Book[] books) {

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getID() + " " +
                    books[i].getCost() + " " +
                    books[i].getNumberOfPages() + " " +
                    books[i].getYearPublisher() + " " +
                    books[i].getPublisher() + " " +
                    books[i].getAutor() + " " +
                    books[i].getName());
        }

    }

    public Book[] PlusCountBook(Book[] books) {
        int i = 0;
        while (i < books.length) {
            books[i].setCost((books[i].getCost() / 100 * 10) + books[i].getCost());
            i++;
        }
        return books;
    }

    public Book[] SpisokAutor(Book[] book) {
        Book[] booksAutor = new Book[book.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора");
        String autor = scanner.nextLine();
        int count = 0;


//        for (Book b: book) {
//         if(b.getAutor().equalsIgnoreCase(autor))
//         {
//          booksAutor[count] = b;
//          count++;
//         }
//        }

        for (int i = 0; i<book.length;i++){
            if (book[i].getAutor().equalsIgnoreCase(autor)){
                booksAutor[count] = book[count];
                count++;
            }
        }
        return Arrays.copyOf(booksAutor,count);


    }
}

