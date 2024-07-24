package mg.training.exo3;

public class BookTest {
    public static void main(String[] args) {
        Author hugo = new Author("Victor Hugo", "hugo@gmail.com", Author.Sex.M);
        Book LesMiserables = new Book("Les misérables", hugo, 50.5, 100);
        Book randomBook = new Book("Random Book", hugo, 50.5, 0);


        System.out.println("Testing if there isn't a book such as randomBook : value = " + randomBook.isBroke());
        System.out.println("Testing the author of the book 'Les misérables' : author = "+LesMiserables.getAuthor());
        System.out.println(LesMiserables.toString());

    }
}
