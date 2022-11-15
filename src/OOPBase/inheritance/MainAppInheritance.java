package OOPBase.inheritance;

public class MainAppInheritance {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Racoon racoon = new Racoon();
        animal.someSound();
        cat.someSound();
        dog.someSound();
        System.out.println("______");
        racoon.someSound();


        //static - не нужно создавать объект того класса (где лежит метод), чтобы воспользоваться данным методом
        Animal.sound();
        // и у наследников также доступен
        cat.sound();

    }
}
