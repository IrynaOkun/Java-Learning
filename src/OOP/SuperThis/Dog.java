package OOP.SuperThis;


public class Dog extends Animal {

    public void eat() {
        System.out.println("Dog eat");
    }

    public void thisEat() {
        System.out.println("Call Dog.eat()");
        this.eat();
    }

    public void superEat() {
        System.out.println("Call Animal.eat()");
        super.eat();
    }
}
