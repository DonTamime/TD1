public class Person {
    private int id;
    private final String name;
    private final String surname;
    private final int Counter = 0;
    private final Book borrowed;
    public Person(String name, String surname) {
        Person.Counter++;
        this.id = Person.Counter;
        this.name = name;
        this.surname = surname;
        this.borrowed = null;
    }
public Book getBorrowed() {
        return this.borrowed;
}
        public Person(String name, String surname, Book borrowed ) {
        this.name = name;
        this.surname = surname;
        this.borrowed = borrowed;
    }
public static void main (String[] args) {
        Book book4 = new Book("Book 4", "Book 4", 40);
        Book book5 = new Book("Book 5", "Book 5", 50);
        Person person1 = new Person("Wick", "John", book4);
        Person person2 = new Person("Lucas", "Marie", book5);
}

}
