package OOP.Polimorfizm;

public class Keyboardist extends Musician{
    public Keyboardist(String name) {
        super(name);
    }
    @Override
    public void play() {
        System.out.println(this.name + " plays a piano.");
    }
}
