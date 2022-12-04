package OOP.ABSTRACTION.Animals;

public class Main {

    public static void main(String args[]) {

        Customer henry = new Customer("Henry", "Baskerville", "Baskerville Hall",
                "GB29 NWBK 6016 1331 9268 19");

        Employee sherlock = new Employee("Sherlock", "Holmes", "221b Baker St",
                61632);
        henry.display();
        System.out.println("");
        sherlock.display();
    }
}
