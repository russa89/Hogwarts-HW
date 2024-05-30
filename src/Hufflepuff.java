public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String secondName, int powerOfMagic, int transgressionDistance, int diligence,
                      int loyalty, int honesty) {
        super(firstName, secondName, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int findSumOfProperties() {
        return diligence + loyalty + honesty;
    }

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {

        if (student1.findSumOfProperties() > student2.findSumOfProperties()) {
            System.out.println(student1.getFirstName() + " " + student1.getSecondName() + " is better Hufflepuff student " +
                    "than " + student2.getFirstName() + " " + student2.getSecondName());
        } else {
            System.out.println(student2.getFirstName() + " " + student2.getSecondName() + " is better Hufflepuff student " +
                    "than " + student1.getFirstName() + " " + student1.getSecondName());
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff student: " + super.getFirstName() + " " + super.getSecondName() + ". Power of magic: " + super.getPowerOfMagic() +
                "; Transgression distance: " + super.getTransgressionDistance() + "; Diligence: " + getDiligence() +
                "; Loyalty: " + getLoyalty() + "; Honesty: " + getHonesty();
    }
    // Zacharias Smith, Cedric Diggory, Justin Finch-Fletchley
}