public class Kogtevran extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Kogtevran(String firstName, String secondName, int powerOfMagic, int transgressionDistance, int intelligence,
                     int wisdom, int wittiness, int creativity) {
        super(firstName, secondName, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int findSumOfProperties() {
        return intelligence + wisdom + wittiness + creativity;
    }

    public static void compareStudents(Kogtevran student1, Kogtevran student2) {

        if (student1.findSumOfProperties() > student2.findSumOfProperties()) {
            System.out.println(student1.getFirstName() + " " + student1.getSecondName() + " is better Kogtevran student " +
                    "than " + student2.getFirstName() + " " + student2.getSecondName());
        } else {
            System.out.println(student2.getFirstName() + " " + student2.getSecondName() + " is better Kogtevran student " +
                    "than " + student1.getFirstName() + " " + student1.getSecondName());
        }
    }

    @Override
    public String toString() {
        return "Kogtevran student: " + super.getFirstName() + " " + super.getSecondName() + ". Power of magic: " + super.getPowerOfMagic() +
                "; Transgression distance: " + super.getTransgressionDistance() + "; Intelligence: " + getIntelligence() +
                "; Wisdom: " + getWisdom() + "; Wittiness: " + getWittiness() + "; Creativity: " + getCreativity();
    }
    //Cho Chang, Padma Patil  и Marcus Belby
}