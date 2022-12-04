package OOP.ConstructorsMethods;

public class CName {

    // класс, который реализует имя
        private String name;
        private String surname;
        private String patronymic;

        // конструкторы класса
        // конструктор без параметров
        CName()
        {
            name = surname = patronymic = "";
        }

        // конструктор с тремя параметрами
        CName(String _name, String _surname, String _patronymic)
        {
            name = _name;
            surname = _surname;
            patronymic = _patronymic;
        }

        // методы доступа
        String GetName() { return name; }
        String GetSurname() { return surname; }
        String GetPatronymic() { return patronymic; }

        // функция, которая демонстрирует применение класса CName
        public static void main(String[] args)
        {
            CName nm1 = new CName(); // вызывается конструктор без параметров

            CName nm2; // просто объявление ссылки на объект класса CName, память еще не выделена

            nm2 = new CName("Happy", "New", "Year!"); // создание объекта - выделение памяти

            // проверка
            String str;
            str = nm1.GetName(); // str = ""
            str = nm1.GetSurname(); // str = ""

            str = nm2.GetName(); // str = "Happy"
            str = nm2.GetSurname(); // str = "New"
            str = nm2.GetPatronymic(); // str = "Year!"
        }
    }
