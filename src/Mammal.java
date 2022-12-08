public class Mammal extends Animal implements AnimalMove, AnimalBehavior{
    String name;
    int age;
    double weight;

    public Mammal()
    {
        this("Mammal", 3, 10.0);
    }
    public Mammal(String name, int age, double weight)
    {
        super(name, age, weight);
    }

    public Mammal(String name, int age)
    {
        this(name, age, 10.0);
    }

    public void eat()
    {
        weight+=0.1;
    }

    public String toString()
    {
        return "Name: " + name + "\nAge: " +age  + "\nWeight: " + weight;
    }

    public String getVoice()
    {
        return "unknown voice";
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    @Override
    public void sleep(){
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}
