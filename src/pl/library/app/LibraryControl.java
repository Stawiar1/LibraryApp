package pl.library.app;

import pl.library.io.DataReader;
import pl.library.model.Book;
import pl.library.model.Library;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop(){
        int option;
        do{
            printOptions();
            option = dataReader.getInt();
            switch(option){
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }while(option != exit);
    }
    private void printOptions() {
        System.out.println("Wybierz opcje:");
        System.out.println(exit+" - Wyjście z programu");
        System.out.println(addBook+" - dodanie nowej książki");
        System.out.println(printBooks+" - wyświetl dostępne książki");

    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
    public void exit(){
        System.out.println("Koniec programu");
        dataReader.close();
    }

}
