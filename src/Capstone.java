public class Capstone implements Resource {
    private String capStoneName;

    public Capstone(String capStoneName) {
        this.capStoneName = capStoneName;
    }

    @Override
    public void borrow() {
        System.out.println("The following information on the capstone project has been taken by a student, the project called: '" + capStoneName + "'.");
    }
}