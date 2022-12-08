public abstract class Animal implements AnimalBehavior, AnimalMove, AnimalName {
    String name;
    int age;
    double weight;

    public Animal()
    {
        this("Animal", 3, 10.0);
    }
    public Animal(String name, int age, double weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public Animal(String name, int age)
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

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}
