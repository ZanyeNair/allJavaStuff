package Zoo;

import java.util.ArrayList;

public class Mammal extends Animal {

    String name;
    int age;
    static ArrayList<String> n = new ArrayList<String>();

    public Mammal() {
        super(n);
        name = "No name yet";
        age = 0;
    }
    public Mammal(String name){
        super(n);
        this.name = name;
        age = 0;
        names.add(name);
        
    }
    public Mammal(String aname, int aage){
        super(n);
        name = aname;
        age = aage;
        names.add(name);
    }
    public void addName(String name){
        names.add(name);
    }
    @Override
    public String sound(){
        return "Mammal sound";
        
    }


    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}
