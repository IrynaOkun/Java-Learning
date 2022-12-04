package OOP.ConstructorsMethods;

public class CLine {

    // класс, который реализует линию на координатной плоскости

        // внутренние переменные класса
        private double x1, y1, x2, y2;

        // конструкторы класса
        // конструктор без параметров
        CLine()
        {
            x1 = y1 = 0;
            x2 = y2 = 1;
        }

        // конструктор с 4 параметрами
        CLine(double x1, double y1, double x2, double y2)
        {
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
        }

        // методы доступа
        // чтение данных
        public double GetX1() { return x1; }
        public double GetY1() { return y1; }
        public double GetX2() { return x2; }
        public double GetY2() { return y2; }

        // запись данных
        void SetXY(double nx1, double ny1, double nx2, double ny2)
        {
            x1 = nx1; y1 = ny1;
            x2 = nx2; y2 = ny2;
        }

        // метод, который вычисляет длину линии
        double Length()
        {
            double len;
            len = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            return len;
        }
    }
