public class Bird extends Animal implements AnimalMove{
    String featherColor;

    public Bird(String name, int age, double weight, String featherColor)
    {
        super(name, age, weight);
        this.featherColor=featherColor;
    }

    public Bird(String name, int age)
    {
        this(name, age, 1, "white");
    }

    public Bird()
    {
        this("Bird", 2, 1, "white");
    }

    public void eat()
    {
        weight+=0.01;
    }

    public String getVoice()
    {
        return "Tweet!";
    }

    public void layEgg()
    {
        System.out.println("Egg is ready!");
    }

    public String toString()
    {
        return super.toString()+
                "\nFeather Color: " + featherColor;
    }
}
