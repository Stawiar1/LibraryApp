class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    //default constructor
    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    //constructor with ISBN
    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this(title , author, releaseDate , pages , publisher);
        this.isbn = isbn;
    }

    //Method print info about books
    void printInfo(){
        String info = title + " , " + author + " , "+
                releaseDate+" , "+publisher+" , "+
                pages+" , "+publisher+" , "+isbn;
        System.out.println(info);
    }

}