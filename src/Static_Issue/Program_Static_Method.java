package Static_Issue;

public class Program_Static_Method {

        public static void main(String[] args) {

            Person3.displayCounter2();    // Counter: 1

            Person3 tom = new Person3();
            Person3 bob = new Person3();

            Person3.displayCounter2();    // Counter: 3
        }
    }
    class Person3{

        private int id1;
        private static int counter1 = 1;

        Person3(){
            id1 = counter1++;
        }
        // статический метод
        public static void displayCounter2(){

            System.out.printf("Counter: %d \n", counter1);
        }
        public void displayId(){

            System.out.printf("Id: %d \n", id1);
        }
    }
