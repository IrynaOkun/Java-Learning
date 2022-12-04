package OOP.Polimorfizm;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Guitarist ritchie = new Guitarist("Ritchie");
        Keyboardist john = new Keyboardist("John");
        Musician david = new Musician("David");

        List<Musician> musicians = Arrays.asList(ritchie, john, david);

        for (Musician m : musicians){
            m.play();
        }

    }
}
