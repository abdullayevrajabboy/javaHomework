public class Car {
    private String colour;
    private String model;
    private int price;
    private String tizim;

    public Car(String colour, String model, int price, String tizim) {
        this.colour = colour;
        this.model = model;
        this.price = price;
        this.tizim = tizim;
    }

    public String getColour(String red) {
        return colour;
    }

    public String getModel(String bmw) {
        return model;
    }

    public int getPrice(int i) {
        return price;
    }

    public String getTizim(String avtomat) {
        return tizim;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTizim(String tizim) {
        this.tizim = tizim;
    }

    private void Information() {
        System.out.println("color:" + this.colour + ",model:" + this.model + ",price:" + this.price + ",tizim:" + this.tizim);

    }

    public static void main(String[] args) {
        Car car = new Car("black", "GM", 11200, "mexanik");
        car.Information();


    }
}
