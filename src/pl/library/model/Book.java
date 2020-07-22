package pl.library.model;

public class Book extends Publication{
    private String author;
    private int pages;
    private String isbn;

    //default constructor
    public Book(String title, String author, int year, int pages, String publisher , String isbn) {
        this.setTitle(title);
        this.author = author;
        this.setYear(year);
        this.pages = pages;
        this.setPublisher(publisher);
        this.isbn = isbn;
    }


    //Method print info about books
    public void printInfo(){
        String info = getTitle() + " , " + author + " , "+
                getYear()+" , "+getPublisher()+" , "+
                pages+" , ";
        if(isbn != null){
            info = info + " " + isbn;
        }
        System.out.println(info);
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}