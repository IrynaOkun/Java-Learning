package OOP.exampleMore;

public class ClassObject {
    /**
    class ClassName {
    //Переменные класса
    //Свойства

    //Конструкторы
    //Методы
    //Деструктор
}
     */
    String name = "Example";

    // "Конструктор"
    public ClassObject(String name) {
        this.name = name;
    }
    // "Метод"
    public String getName() {
        return name;
    }

    //Создание экземпляра класса:
    //MyClass myClass = new MyClass("Example");
}
