public class Main {
    public static void main(String[] args) {
        AnimalCharter animalCharter = new AnimalCharter();

        animalCharter.setAnimal(new Dog());
        animalCharter.cry();
        animalCharter.setAnimal(new Cat());
        animalCharter.cry();
    }
}
