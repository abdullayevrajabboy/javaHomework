public class Computers extends Electronics{
    private String cpuModel;
    private int ramSize;

    public Computers(String brand, double price, String cpuModel, int ramSize) {
        super(brand, price);
        this.cpuModel = cpuModel;
        this.ramSize = ramSize;
    }

    public String getCpuModel(){
        return cpuModel;
    }
    public int getRamSize(){
        return ramSize;
    }
}
