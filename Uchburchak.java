package Homework;

public class Uchburchak {
    float katet1;
    float katet2;
    float gipotenuza;

    public Uchburchak(float katet1, float katet2, float gipotenuza) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = gipotenuza;
    }

    void Information(){
        System.out.println("birinchi tomon:"+this.katet1+", ikkinchi tomon:"+this.katet2+",gipotenuza:"+this.gipotenuza);
    }

    public static void main(String[] args) {
        Uchburchak uchburchak=new Uchburchak(3.0F, 4.0F, 5.0F);
        uchburchak.Information();
    }
}
