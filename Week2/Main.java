public class Main {

    public static void main(String[] args){
        Animal theAnimal = new Animal();
        theAnimal.speak();

        Tiger theTiger = new Tiger();
        theTiger.speak();

        Elephant theElephant = new Elephant();
        theElephant.speak();

        theAnimal = theTiger;
        theAnimal.speak();

        theAnimal = theElephant;
        theAnimal.speak();
    }
}