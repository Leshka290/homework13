import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int dateCreate;

    public Book(String title, Author author, int dateCreate ) {
        this.title = title;
        this.author = author;
        this.dateCreate = dateCreate;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, dateCreate);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() == obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return getTitle().equals(book.getTitle()) && getDateCreate() == book.getDateCreate()
                && author.equals(book.getAuthor());

    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\n" + author.toString() + "\nDate Create: " + getDateCreate();
    }
}
