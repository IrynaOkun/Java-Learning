package OOP.Polimorfizm;

public class Musician {

    protected String name;
    public void play(){
        System.out.println(this.name + " plays anything he sees.");
    }

    public Musician(String name){
        this.name = name;
    }
}
