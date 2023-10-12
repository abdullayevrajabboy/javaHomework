public class Laptop extends Computers{
    private String screenSize;
    private String operatingSystem;

    public Laptop(String brand, double price, String cpuModel, int ramSize, String screenSize, String operatingSystem) {
        super(brand, price, cpuModel, ramSize);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
