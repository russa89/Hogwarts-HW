public class Slytherin extends Hogwarts {

    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String firstName, String secondName, int powerOfMagic, int transgressionDistance, int cunning,
                     int resoluteness, int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, secondName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int findSumOfProperties() {
        return cunning + resoluteness + ambition + resourcefulness + thirstForPower;
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {

        if (student1.findSumOfProperties() > student2.findSumOfProperties()) {
            System.out.println(student1.getFirstName() + " " + student1.getSecondName() + " is better Slytherin student " +
                    "than " + student2.getFirstName() + " " + student2.getSecondName());
        } else {
            System.out.println(student2.getFirstName() + " " + student2.getSecondName() + " is better Slytherin student " +
                    "than " + student1.getFirstName() + " " + student1.getSecondName());
        }
    }

    @Override
    public String toString() {
        return "Slytherin student: " + super.getFirstName() + " " + super.getSecondName() + ". Power of magic: " + super.getPowerOfMagic() +
                "; Transgression distance: " + super.getTransgressionDistance() + "; Cunning: " + getCunning() +
                "; Resoluteness: " + getResoluteness() + "; Ambition: " + getAmbition() + "; Resourcefulness: " +
                getResourcefulness() + "; Thirst of power: " + getThirstForPower();
    }
//Draco Malfoy, Graham Montague, Gregory Goyle;
}