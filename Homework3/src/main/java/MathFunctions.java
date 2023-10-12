public class MathFunctions {

    public static final double PI=  3.14159265359;
    public static final double e=2.71828182846;


    public static double DoiraYuzi(double r){
        return PI*r*r;
    };

   public static double eDaraja(double a){
       return Math.pow(e,a);
   }
   public static double UchburchakYuza(double a,double b,double c){
       double s=(a+b+c)/2;
       return Math.sqrt(s*(s-a)*(s-b)*(s-c));
   }

    public static void main(String[] args) {
        System.out.println("PI="+PI);
        System.out.println("e="+e);

        double r=5;
        double doiraYuzasi=DoiraYuzi(r);
        System.out.println("radius="+r+",Doirasi yuzasi:"+doiraYuzasi);

        double son=2;
        double eDarajasi=eDaraja(son);
        System.out.println("e ni darjasini topish:"+eDarajasi);

        double a=3,b=4,c=5;
        double UchburchakYuzi=UchburchakYuza(a,b,c);
        System.out.println("Uchburchak yuz="+UchburchakYuzi);
    }


}
