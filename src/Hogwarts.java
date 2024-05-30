public class Hogwarts {
    private String firstName;
    private String secondName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String firstName, String secondName, int powerOfMagic, int transgressionDistance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int findSumOfProperties() {
        return powerOfMagic + transgressionDistance;
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {

        if (student1.findSumOfProperties() > student2.findSumOfProperties()) {
            System.out.println(student1.getFirstName() + " " + student1.getSecondName() + " has more power of magic " +
                    "than " + student2.getFirstName() + " " + student2.getSecondName());
        } else {
            System.out.println(student2.getFirstName() + " " + student2.getSecondName() + " has more power of magic " +
                    "than " + student1.getFirstName() + " " + student1.getSecondName());
        }

    }
}