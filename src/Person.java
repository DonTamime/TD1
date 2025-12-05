public class Person {
    private  int id;
    private final String name;
    private final int surname;
    private static int Counter = 0;
    private Book borrowed;
    public Person(int id, String name, int surname) {
        this.id = Person.Counter;
        Person.Counter++;
        this.name = name;
        this.surname = surname;
        this.borrowed = null;
    }
public Book isBorrowed(boolean b) {
        return borrowed;
}
        public Person(String name, int surname, Book borrowed ) {
        this.name = name;
        this.surname = surname;
        this.borrowed = borrowed;
        borrowed = isBorrowed(true);


    }


}
