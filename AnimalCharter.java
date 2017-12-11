public class AnimalCharter{
    private Animal animal;

    public void setAnimal(Animal animal) {this.animal = animal;}

    public void cry(){
        if(animal == null) {
            System.out.println("없음");

        }
        else {
            animal.cry();
            animal.move();
            animal.display();
        }
    }
 }
