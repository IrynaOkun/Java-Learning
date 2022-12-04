package OOP.ConstructorsMethods;

public class CTestLine {

    public static void main(String[] args) {
        double x, y; // дополнительные переменные

        // создание объекта класса CLine с помощью конструктора без параметров
        CLine line1 = new CLine();

        // создание объекта класса CLine с помощью конструктора с 4 параметрами
        CLine line2 = new CLine(2.0, 3.0, 4.0, 5.0);

        // использование объектов класса line1
        x = line1.GetX1(); // x = 0.0
        y = line1.GetY2(); // y = 1.0

        // использование объекта класса line2
        x = line2.GetX1(); // x = 2.0
        x = line2.GetX2(); // x = 4.0
        y = line2.GetY2(); // y = 5.0

        // переопределение объекта line1, предшествующий объект будет уничтожен при "сборке" мусора
        line1 = new CLine(-4.0, -2.0, 33.4, -20.5);

        x = line1.GetX1(); // x = -4.0
        y = line1.GetY2(); // y = -20.5
    }
}

