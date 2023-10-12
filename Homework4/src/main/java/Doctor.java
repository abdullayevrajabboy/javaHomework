public class Doctor {
    public String name;
    public String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getInfo() {
        return "Doctor's name: " + name + ", Specialization: " + specialization;
    }
}
