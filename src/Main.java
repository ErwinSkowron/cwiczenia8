
public class Main{
    public static void main(String[] args)
    {
        Zad2();
    }

    public static void Zad2()
    {
        Animal[] Animals = new Animal[6];
        Animals[0] = new Mammal("Da", 4);
        Animals[1] = new Bird("Red", 1, 0.5, "Red");
        Animals[2] = new Dog("Dog", 4, 6, "York");
        Animals[3] = new Pigeon("ds", 2, 0.3, "Blue", "flying", 21);
        Animals[4] = new Fish("Fish", 1, "Salt Water");
        Animals[5] = new Blowfish("Fish", 1, 1, "Salt Water");


        for (Animal animal: Animals)
        {
            animal.eat();
            animal.getVoice();
            animal.sleep();
            System.out.println(animal);
            animal.move();
            AnimalName.name(animal.getName());
        }

        AnimalBehavior[] animalBehaviors = new AnimalBehavior[3];
        animalBehaviors[0] = new Dog("Snack", 10, 10.5, "York");
    }

}
