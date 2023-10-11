public class Car {
    String colour;
    String model;
    int price;
    String tuzilma;

    public Car(String colour, String model, int price, String tuzilma) {
        this.colour = colour;
        this.model = model;
        this.price = price;
        this.tuzilma = tuzilma;
    }

    void Information(){
        System.out.println("rangi:"+this.colour+", modeli:"+this.model+",narxi:"+this.price+" ,tuzilma:"+this.tuzilma);
    }

    public static void main(String[] args) {
        Car car=new Car("black","GM",12000,"avtomat");
        car.Information();
    }
}
