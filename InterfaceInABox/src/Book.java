public class Book implements Packable {

    private String author;
    private String nameOfTheBook;
    private double weightOfBook;

    public Book(String author, String nameOfTheBook, double weightOfBook) {
        this.author = author;
        this.nameOfTheBook = nameOfTheBook;
        this.weightOfBook = weightOfBook;
    }

    @Override
    public String toString () {
        return this.author + " " + this.nameOfTheBook;
    }

    @Override
    public double weight() {
        return this.weightOfBook;
    }

}