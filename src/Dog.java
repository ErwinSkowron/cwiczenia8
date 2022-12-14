public class Dog extends Mammal implements AnimalMove, AnimalBehavior{

    private String breed;

    public Dog(String name, int age, double weight, String breed)
    {
        super(name, age, weight);
        this.breed=breed;
    }

    public Dog(String name, int age)
    {
        this(name, age, 1, "York");
        this.breed=breed;
    }

    public String Aport()
    {
        return "Pies aportuje";
    }

    public String getVoice()
    {
        return "Pies szczeka";
    }

    public void eat (String foodName)
    {
        System.out.println("The dog is eating " + foodName);
    }

    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void move()
    {
        System.out.println("Dog run on four paws");
    }

    @Override
    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }
}
