public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void getName() {
        System.out.println("cat");
    }

    public static void main(String[] args) {
        Animal cat=new Cat();
        cat.getName();
        cat.sound();
    }
}
