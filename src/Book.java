public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private final static int DEFAULT_NUMBER_OF_PAGES = 5;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public final static String DEFAULT_TITLE = "Book";
    public final static String DEFAULT_AUTHOR = "Author";

    public Book() {
        this.title = DEFAULT_TITLE;
        this.author = DEFAULT_AUTHOR;
        this.numberOfPages = DEFAULT_NUMBER_OF_PAGES;
    }

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;

        if(numberOfPages < 0 || numberOfPages > 100) {
            this.numberOfPages = DEFAULT_NUMBER_OF_PAGES;
        } else {
            this.numberOfPages = numberOfPages;

        }
    }

    public static void main(String [] args) {
        Book book1 = new Book();
        System.out.println("Book 1 : " + book1.getTitle() + ", " + book1.getNumberOfPages() + " pages.");
        Book book2 = new Book("One piece", "ODA",DEFAULT_NUMBER_OF_PAGES);
        System.out.println("Book 2 : " + book2.getTitle() + ", " + book2.getNumberOfPages() + " pages.");
        Book book3 = new Book("Hunter x Hunter", "Je sais plus",150);
        System.out.println("Book 3 : " + book3.getTitle() + ", " + book3.getNumberOfPages() + " pages.");
    }
    }



