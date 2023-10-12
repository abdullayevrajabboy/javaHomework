public class Sounds extends Electronics{
    private int power;
    private boolean bluetoothSupport;

    public Sounds(String brand, double price, int power, boolean bluetoothSupport) {
        super(brand, price);
        this.power = power;
        this.bluetoothSupport = bluetoothSupport;
    }

    public int getPower() {
        return power;
    }

    public boolean isBluetoothSupport() {
        return bluetoothSupport;
    }
}
