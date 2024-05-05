public class Newspaper implements Resource {
    private String newspaperTitle;

    public Newspaper(String newspaperTitle) {
        this.newspaperTitle = newspaperTitle;
    }

    @Override
    public void borrow() {
        System.out.println("A student has borrowed the newspaper titled: '" + newspaperTitle + "'.");
    }
}