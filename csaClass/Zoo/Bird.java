package Zoo;

public class Bird extends Mammal{
    private String name;
    private int age;
    private String featherColor;
    public Bird(String name, int age, String featherColor){
        super(name, age);
        this.featherColor = featherColor;
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nFeather Color: " + featherColor;
    }

    @Override
    public String sing(){
        return "Bird sound";
    }
}