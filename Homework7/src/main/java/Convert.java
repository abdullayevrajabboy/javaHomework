public class Convert implements BaseConverter {


    @Override
    public float SelsiyToKelvin(float selsiy) {
        return (float) (selsiy + 273.15);
    }

    @Override
    public float SelsiyToFarangeyt(float selsiy) {
        return (float) (selsiy * 1.8 + 32);
    }

    public static void main(String[] args) {
        BaseConverter convert = new Convert();
        float selsiyToKelvin = convert.SelsiyToKelvin(25);
        float selsiyToFarangeyt = convert.SelsiyToFarangeyt(25);
        System.out.println("selsiy to kelsin:"+selsiyToKelvin);
        System.out.println("selsiy to farangeyt:"+selsiyToFarangeyt);
    }
}
