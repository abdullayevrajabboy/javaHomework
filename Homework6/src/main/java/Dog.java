public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("bow bow");
    }

    @Override
    public void getName() {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.getName();
        dog.sound();
    }
}
