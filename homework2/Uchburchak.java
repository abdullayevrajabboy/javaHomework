public class Uchburchak {
    private float katet1;
    private float katet2;
    private float gip;

    public Uchburchak(float katet1, float katet2, float gip) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gip = gip;
    }

    public float Yuza() {
        return (this.katet1 * this.katet2) / 2;
    }

    ;

    public float Perimetr() {
        return this.katet1 + this.katet2 + this.gip;
    }

    public static void main(String[] args) {
        Uchburchak uchburchak = new Uchburchak(3F, 4F, 5F);
        System.out.println("tomonlari:" + uchburchak.katet1 + "," + uchburchak.katet2 + "," + uchburchak.gip);
        System.out.println("yuza:" + uchburchak.Yuza());
        System.out.println("perimetr:" + uchburchak.Perimetr());
    }

}
