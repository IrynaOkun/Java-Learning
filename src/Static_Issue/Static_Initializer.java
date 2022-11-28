package Static_Issue;

public class Static_Initializer {

        public static void main(String[] args) {

            Person2 tom = new Person2();
            Person2 bob = new Person2();

            tom.displayId();    // Id = 105
            bob.displayId();    // Id = 106
        }
    }
    class Person2{

        private int id;
        static int counter;

        static{
            counter = 105;
            System.out.println("Static initializer");
        }
        Person2(){
            id=counter++;
            System.out.println("Constructor");
        }
        public void displayId(){

            System.out.printf("Id: %d \n", id);
        }
    }
