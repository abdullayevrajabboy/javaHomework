public class Person {
    String ism;
    float boyi;
    int vazn;
    int yosh;

    public Person(String ism, float boyi, int vazn, int yosh) {
        this.ism = ism;
        this.boyi = boyi;
        this.vazn = vazn;
        this.yosh = yosh;
    }

    void Information(){
        System.out.println("ismi:"+this.ism+",bo'yi:"+this.boyi+",vazni:"+this.vazn+",yoshi:"+this.yosh);
    }

    public static void main(String[] args) {
        Person person=new Person("aziz",1.65F,65,18);
        person.Information();
    }
}
