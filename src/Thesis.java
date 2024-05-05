public class Thesis implements Resource {
    private String thesisTitle;

    public Thesis(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void borrow() {
        System.out.println("A student has borrowed the thesis titled: '" + thesisTitle + "'.");
    }
}
