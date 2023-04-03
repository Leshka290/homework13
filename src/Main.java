
public class Main {
    public static void main(String[] args) {

        Author joanneRowling = new Author("Joanne", "Rowling");
        Author johnRonald = new Author("John", "Ronald Reuel Tolkien");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone",
                joanneRowling, 1997);
        Book theLordOfTheRings = new Book("The Lord of the Rings",
                johnRonald, 1954);
        theLordOfTheRings.setDateCreate(1955);
        System.out.println(harryPotter);
        System.out.println(joanneRowling);
    }
}