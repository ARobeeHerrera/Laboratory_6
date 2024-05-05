public class Internet implements Resource {
    private String accessDetails;

    public Internet(String accessDetails) {
        this.accessDetails = accessDetails;
    }

    @Override
    public void borrow() {
        System.out.println("A student has utilized the internet with the following details:' '" + accessDetails+ "'.");
    }
}
