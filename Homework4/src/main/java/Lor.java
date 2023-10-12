public class Lor extends Doctor {
    private String lorType;

    public Lor(String name, String specialization, String lorType) {
        super(name, specialization);
        this.lorType = lorType;
    }

    @Override
    public String getInfo() {
        return "Lor's name: " + name + ", Specialization: " + specialization + ", Lor Type: " + lorType;
    }
}
