public class Loudspeaker extends Sounds{
    private String nameOfLoudspeaker;
    private int priceOfLoudSpeaker;

    public Loudspeaker(String brand, double price, int power, boolean bluetoothSupport, String nameOfLoudspeaker, int priceOfLoudSpeaker) {
        super(brand, price, power, bluetoothSupport);
        this.nameOfLoudspeaker = nameOfLoudspeaker;
        this.priceOfLoudSpeaker = priceOfLoudSpeaker;
    }

    public String getNameOfLoudspeaker() {
        return nameOfLoudspeaker;
    }

    public int getPriceOfLoudSpeaker() {
        return priceOfLoudSpeaker;
    }
}
