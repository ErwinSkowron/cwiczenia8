public class Pigeon extends Bird{
    String species;
    int carHits;

    public Pigeon(String name, int age, double weight, String featherColor, String species, int carHits)
    {
        super(name, age, weight, featherColor);
        this.species=species;
        this.carHits=carHits;
    }

    public Pigeon(String name, int age)
    {
        this(name, age, 0.3, "white", "Pigeon", 21);
    }

    public void eat()
    {
        weight+=0.005;
    }

    public String getVoice()
    {
        return "Coo!";
    }

    public void layEgg()
    {
        System.out.println("Pigeon egg is ready!");
    }

    public void fly()
    {
        System.out.println("Pigeon is flying");
    }

    public String toString()
    {
        return super.toString()+"\nFeather color: " + featherColor;
    }

    @Override
    public void sleep()
    {

    }
}
