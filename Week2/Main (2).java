public class Main {

    public static void main(String[] args){
        Animal theAnimal = new animal();
        theAnimal.speak();

        Tiger theTiger = new Tiger();
        theTiger.speak();

        Animal anotherAnimal = new Tiger();
        anotherAnimal.speak();
    }
}