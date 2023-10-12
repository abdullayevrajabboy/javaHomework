public class Subwoofer extends Sounds{
    private String subwooferType;

    public Subwoofer(String brand, double price, int power, boolean bluetoothSupport, String subwooferType) {
        super(brand, price, power, bluetoothSupport);
        this.subwooferType = subwooferType;
    }

    public String getSubwooferType() {
        return subwooferType;
    }
}
