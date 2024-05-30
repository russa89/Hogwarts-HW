public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 100, 100,
                100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 98, 97,
                96, 98, 90);
        Gryffindor ronaldWeasley = new Gryffindor("Ronald", "Weasly", 90, 95,
                89, 93, 86);
        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 92, 87,
                96, 96, 100, 92, 100);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 86, 81,
                94, 99, 99, 78, 68);
        Slytherin gregoryGoyle = new Slytherin("Gregory", " Goyle", 89, 76,
                89, 72, 80, 81, 65);
        Kogtevran choChang = new Kogtevran("Cho", "Chang", 85, 83, 98,
                86, 72, 100);
        Kogtevran padmaPatil = new Kogtevran("Padma", "Patil", 71, 99, 82,
                71, 79, 86);
        Kogtevran marcusBelby = new Kogtevran("Marcus", "Belby", 77, 84, 91,
                67, 92, 70);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias", "Smith", 71, 100,
                69, 65, 82);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 92, 90,
                77, 86, 92);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", 80, 71,
                93, 92, 50);


        System.out.println("harryPotter = " + harryPotter);
        System.out.println("hermioneGranger = " + hermioneGranger);
        System.out.println("ronaldWeasley = " + ronaldWeasley);
        System.out.println("dracoMalfoy = " + dracoMalfoy);
        System.out.println("grahamMontague = " + grahamMontague);
        System.out.println("gregoryGoyle = " + gregoryGoyle);
        System.out.println("choChang = " + choChang);
        System.out.println("padmaPatil = " + padmaPatil);
        System.out.println("marcusBelby = " + marcusBelby);
        System.out.println("zachariasSmith = " + zachariasSmith);
        System.out.println("cedricDiggory = " + cedricDiggory);
        System.out.println("justinFinchFletchley = " + justinFinchFletchley);

        Gryffindor.compareStudents(ronaldWeasley, harryPotter);
        Slytherin.compareStudents(grahamMontague, gregoryGoyle);
        Kogtevran.compareStudents(padmaPatil, choChang);
        Hufflepuff.compareStudents(cedricDiggory, justinFinchFletchley);
        Hogwarts.compareStudents(harryPotter, zachariasSmith);
    }
}