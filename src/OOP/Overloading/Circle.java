package OOP.Overloading;

//перегрузка конструкторов

public class Circle {

    // класс, реализующий окружность на координатной плоскости
    private int x, y; // координаты центра окружности
    private int r; // радиус окружности

    // перегруженные конструкторы
    // конструктор без параметров
    Circle() {
        x = y = 0;
        r = 1;
    }

    // конструктор с 1 параметром
    Circle(int r) {
        this.r = r;
    }

    // конструктор с 2 параметрами
    Circle(int x, int y) {
        this.x = x;
        this.y = y;
        r = 1;
    }

    // конструктор с 3 параметрами
    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // методы доступа
    // возвращает объект Circle
    Circle GetCircle() {
        // создать новый объект типа Circle, обязательно выделить память для него
        Circle c = new Circle(x, y, r);
        return c;    // возвратить объект
    }

    // возвратить координаты и радиус
    int GetX() {
        return x;
    }

    int GetY() {
        return y;
    }

    int GetR() {
        return r;
    }

    // установить новые значения x, y, r
    int SetXYR(int nx, int ny, int nr) {
        x = nx;
        y = ny;
        r = nr;
        return nx;
    }

    // метод, который вычисляет площадь окружности
    double GetSquare() {
        return (double) (3.1415 * r * 4);
    }

    public static void main(String[] args) {
        // использование класса Circle в другом программном коде
        Circle c0 = new Circle(); // вызов конструктора без параметров
        Circle c1 = new Circle(5); // вызов конструктора с 1 параметром
        Circle c2 = new Circle(20, 15); // вызов конструктора с 2 параметрами
        Circle c3 = new Circle(10, 8, 5); // вызов конструктора с 3 параметрами
        int d;

// проверка
        d = c0.GetR(); // d = 1
        d = c1.GetX(); // d = 0
        d = c2.GetY(); // d = 15
        d = c3.GetR(); // d = 5

        double s = c3.GetSquare(); // s = 62.830000000000005
    }
    //main diff




}
