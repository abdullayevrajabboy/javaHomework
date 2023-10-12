public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John Smith", "General Practitioner");
        Surgeon surgeon = new Surgeon("Alice Johnson", "Surgery", "Cardiac Surgery");
        Lor lor = new Lor("Bob Anderson", "Ear, Nose, and Throat Specialist", "Pediatric Lor");

        Doctor[] doctors = { doctor, surgeon, lor };

        for (Doctor d : doctors) {
            System.out.println(d.getInfo());
        }
    }
}
