public class Trapezium implements GeometricFigure {
    private  int sideA;
    private  int sideB;
    private  int high;


    public Trapezium(int sideA, int sideB, int high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public void area() {
        System.out.println("Trapetsiya yuzasi:" + (sideA + sideB) * high / 2);
    }

    @Override
    public void perimeter() {
        int sideC = (int) Math.sqrt(Math.pow(high, 2) + Math.pow((sideA - sideB) / 2, 2));
        int perimetr=sideA+sideB+sideC;
        System.out.println("perimetr trapetsiya:"+perimetr);
    }

    public static void main(String[] args) {
        GeometricFigure trapezium=new Trapezium(9,3,4);
        trapezium.area();
        trapezium.perimeter();
    }
}
