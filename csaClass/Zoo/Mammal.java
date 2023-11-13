package Zoo;

import java.util.ArrayList;

public class Mammal extends Animal {

    private String name;
    int age;
    private ArrayList<String> n = new ArrayList<String>();

    public Mammal() {
        super();
        name = "No name yet";
        age = 0;
    }
    public Mammal(String name){
        super();
        this.name = name;
        age = 0;
        n.add(name);
        
    }
    public Mammal(String aname, int aage){
        super();
        name = aname;
        age = aage;
        n.add(name);
    }
    public void addName(String name){
        n.add(name);
    }
    @Override
    public String sing(){
        return "Mammal sound";
        
    }


    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}
