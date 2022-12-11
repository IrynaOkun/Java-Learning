package OOP.OverloadingOverriding;

public class B extends A {
    void method() {
        // метод класса B, переопределяет метод класса A
        System.out.println("Method B");
    }

    void method2() {
        System.out.println("Method2 - B");
        super.method(); // вызов метода суперкласса A
    }

}
