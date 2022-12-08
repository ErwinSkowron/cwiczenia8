public class Fish extends Blowfish{
    String preferedTypeWater;

    public Fish(String name, double weight, String preferedTypeWater)
    {
        this.name=name;
        this.weight=weight;
        this.preferedTypeWater=preferedTypeWater;
    }

    public Fish(String name, int age)
    {
        this(name, 2, "Salt Water");
    }

    public void eat()
    {
        weight+=0.005;
    }

    public void swimm()
    {
        System.out.println("Fish is swimming");
    }

}
