package Overloading;

public class Complex {

    // скрытые данные класса
    private double a; // действительная часть
    private double b; // мнимая часть

    // конструктор класса
    Complex() {
        a = 1;
        b = 1;
    }

    // методы доступа

    double GetA() {
        return a;
    }

    double GetB() {
        return b;
    }

    void SetComplex(double a, double b) // для типа double
    {
        this.a = a;
        this.b = b;
    }

    // Перегруженный метод Mult()

    // без параметров - возведение в квадрат
    Complex Mult() {
        Complex c = new Complex();
        double A, B;

        A = a * a - b * b;
        B = a * b + b * a;

        c.SetComplex(A, B);
        return c;
    }

    // метод Mult() с 1 параметром - умножение комплексного числа на обычное число
    Complex Mult(double d) {
        Complex c = new Complex();
        double A, B;

        A = a * d;
        B = b * d;
        c.SetComplex(A, B);

        return c;
    }

    // метод Mult() с 2 параметрами - умножение комплексных чисел
    Complex Mult(double a2, double b2) {
        Complex c = new Complex();
        double A, B;

        A = a * a2 - b * b2;
        B = a * b2 + b * a2;
        c.SetComplex(A, B);

        return c;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        double A, B;

        c1.SetComplex(2.0, 3.0);

// использование перегруженного метода Mult()
        Complex c2 = c1.Mult(); // возведение в квадрат

        A = c2.GetA(); // A = -5.0
        B = c2.GetB(); // B = 12.0

        c2 = c1.Mult(4); // умножение на число
        A = c2.GetA(); // A = 8.0
        B = c2.GetB(); // B = 12.0

        c2 = c1.Mult(1, 3); // умножение на комплексное число
        A = c2.GetA(); // A = -7.0
        B = c2.GetB(); // B = 9.0

    }
}
