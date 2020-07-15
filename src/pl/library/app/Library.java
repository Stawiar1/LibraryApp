package pl.library.app;

import pl.library.io.DataReader;
import pl.library.model.Book;

import java.util.Scanner;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[1000];

        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();

    }
}