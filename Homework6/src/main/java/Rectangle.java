public class Rectangle implements GeometricFigure{
   private  int sideA;
   private  int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void area() {
        System.out.println("to'rtburchak yuzasi:"+sideA*sideB);
    }

    @Override
    public void perimeter() {
        System.out.println("to'rtburchak perimetri:"+2*(sideA+sideB));
    }

    public static void main(String[] args) {
        GeometricFigure rectangle=new Rectangle(3,4);
        rectangle.area();
        rectangle.perimeter();
    }
}
