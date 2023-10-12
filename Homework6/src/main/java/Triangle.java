public class Triangle implements GeometricFigure {
    private  int sideA;
    private  int sideB;
    private  int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void area() {
        int p = (sideA + sideB + sideC) / 2;
        System.out.println("uchburchak yuzasi="+Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)));
    }

    @Override
    public void perimeter() {
        int perimetr=sideA+sideB+sideC;
        System.out.println("uchburchak perimetri="+perimetr);
    }

    public static void main(String[] args) {
        GeometricFigure triangle=new Triangle(3,4,5);
        triangle.area();
        triangle.perimeter();
    }
}
