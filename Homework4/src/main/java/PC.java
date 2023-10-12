public class PC extends Computers{
    private String modelPC;
    private int priceOfPC;

    public PC(String brand, double price, String cpuModel, int ramSize, String modelPC, int priceOfPC) {
        super(brand, price, cpuModel, ramSize);
        this.modelPC = modelPC;
        this.priceOfPC = priceOfPC;
    }

    public String getModelPC() {
        return modelPC;
    }

    public int getPriceOfPC() {
        return priceOfPC;
    }
}
