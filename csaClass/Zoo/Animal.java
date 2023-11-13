package Zoo;

import java.util.ArrayList;

public class Animal{

    private ArrayList<String> nameo = new ArrayList<String>();
    public Animal (){}
    public Animal(String name){

        nameo.add(name);


    }
    public void addName(String name){
        nameo.add(name);
    }
    public String sing(){
        return "Animal sound";
    }
    
    
}
