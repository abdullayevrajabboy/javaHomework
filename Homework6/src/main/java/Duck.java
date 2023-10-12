public class Duck implements Animal{
    @Override
    public void sound() {
        System.out.println("quack quack");
    }

    @Override
    public void getName() {
        System.out.println("duck");
    }

    public static void main(String[] args) {
        Animal duck=new Duck();
        duck.sound();
        duck.getName();
    }
}
