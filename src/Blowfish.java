public class Blowfish extends Animal implements AnimalMove, AnimalBehavior {

    String preferedTypeWater;

    public Blowfish(String name, int age, double weight, String preferedTypeWater)
    {
        super(name, age, weight);
        this.preferedTypeWater=preferedTypeWater;

    }

    public Blowfish(String name)
    {
        this(name, 1, 1, "Salt Water");
    }

    public Blowfish()
    {
        this("Fish", 1, 1, "Salt Water");
    }

    public void eat()
    {
        weight+=0.01;
    }

    public void swimm()
    {
        System.out.println("Fish is swimming");
    }

}
