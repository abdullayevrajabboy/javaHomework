public class MathFunctions {

    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
    public double sub(double a, double b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }


    public int div(int a,int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Maxraj 0 bo'lishi mumkin emas");
        }

    }
   public double div(double a,double b) {
       if (b != 0.0) {
           return a / b;
       } else {
           throw new ArithmeticException("Maxraj 0 bo'lishi mumkin emas");
       }

    }


    public int abs(int a) {
        return Math.abs(a);
    }
    public double abs(double a) {
        return Math.abs(a);
    }


    public int pow(int a) {
        return (int) Math.pow(a, 2);
    }
    public double pow(double a) {
        return Math.pow(a, 2);
    }

    public static void main(String[] args) {
        MathFunctions math=new MathFunctions();
        int result1 = math.add(10, 5); // int versiya
        double result2 = math.add(7.5, 3.0); // double versiya

        int result3 = math.sub(10, 5); // int versiya
        double result4 = math.sub(7.5, 3.0); // double versiya

        int result5 = math.multiply(10, 5); // int versiya
        double result6 = math.multiply(7.5, 3.0); // double versiya

        int result7 = math.div(10, 5); // int versiya
        double result8 = math.div(7.5, 3.0); // double versiya

        int result9 = math.abs(-10); // int versiya
        double result10 = math.abs(-7.5); // double versiya

        int result11 = math.pow(3); // int versiya
        double result12 = math.pow(3.0); // double versiya
    }

}
