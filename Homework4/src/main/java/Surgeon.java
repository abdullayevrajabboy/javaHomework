public class Surgeon extends Doctor {
    private String surgeryType;

    public Surgeon(String name, String specialization, String surgeryType) {
        super(name, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String getInfo() {
        return "Surgeon's name: " + name + ", Specialization: " + specialization + ", Surgery Type: " + surgeryType;
    }
}
