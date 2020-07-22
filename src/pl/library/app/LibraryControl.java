package pl.library.app;

import pl.library.io.DataReader;
import pl.library.model.Book;
import pl.library.model.Library;
import pl.library.model.Magazine;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINT_BOOKS = 3;
    private static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop(){
        int option;
        do{
            printOptions();
            option = dataReader.getInt();
            switch(option){
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }while(option != EXIT);
    }
    private void printOptions() {
        System.out.println("Wybierz opcje:");
        System.out.println(EXIT +" - Wyjście z programu");
        System.out.println(ADD_BOOK +" - dodanie nowej książki");
        System.out.println(ADD_MAGAZINE+" - Dodanie nowego magazynu");
        System.out.println(PRINT_BOOKS +" - wyświetl dostępne książki");
        System.out.println(PRINT_MAGAZINES+ " - wyświetl dostępne magazyny");

    }

    private void printBooks() {
        library.printBooks();
    }

    private void printMagazines(){library.printMagazines();}

    private void addMagazine(){
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
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
