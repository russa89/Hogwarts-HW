public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String firstName, String secondName, int powerOfMagic, int transgressionDistance, int nobility,
                      int honor, int courage) {
        super(firstName, secondName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int findSumOfProperties() {
        return nobility + honor + courage;
    }

    public static void compareStudents(Gryffindor student1, Gryffindor student2) {

        if (student1.findSumOfProperties() > student2.findSumOfProperties()) {
            System.out.println(student1.getFirstName() + " " + student1.getSecondName() + " is better Gryffindor student " +
                    "than " + student2.getFirstName() + " " + student2.getSecondName());
        } else {
            System.out.println(student2.getFirstName() + " " + student2.getSecondName() + " is better Gryffindor student " +
                    "than " + student1.getFirstName() + " " + student1.getSecondName());
        }
    }


    @Override
    public String toString() {
        return "Gryffindor student: " + super.getFirstName() + " " + super.getSecondName() + ". Power of magic: " + super.getPowerOfMagic() +
                "; Transgression distance: " + super.getTransgressionDistance() + "; Nobility: " + getNobility() +
                "; Honor: " + getHonor() + "; Courage: " + getCourage();
    }
    //Harry Potter, Hermione Granger и Ronald Weasley
}

