public class Animal {

    //attributes
    private int energy;

    //constructors
    public Animal() {
        energy = 10;
    }

    //behaviours (methods)
    public void eat(int amount) {
        energy = energy + amount;
    }

    public void speak() {
        System.out.println("aah");
    }

}