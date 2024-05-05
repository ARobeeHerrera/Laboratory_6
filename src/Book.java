public class Book implements Resource {
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void borrow() {
        System.out.println("The book titled has been borrowed by a student, the book called: '" + bookTitle + "'.");
    }
}
