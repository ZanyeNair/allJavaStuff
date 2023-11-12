package Zoo;

import java.util.ArrayList;

public class Animal{

    ArrayList<String> names = new ArrayList<String>();
    public Animal (){}
    public Animal(ArrayList<String> list){
        for(String name : list){
            names.add(name);
        }

    }
    public void addName(String name){
        names.add(name);
    }
    public String sound(){
        return "Animal sound";
    }
    
    
}
