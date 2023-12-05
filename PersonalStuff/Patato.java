package PersonalStuff;


public class Patato{
    public static void main(String[] args) {
        Patato x= new PatatoBuilder().addSourCream(11).addCheese(11).addSalsa(11).build();
    }
}


 class Patato {
    int cheese;
    int sourcream;
    int salsa;
    public Patato(int c, int sc, int sa){

    }



}

class PatatoBuilder{
    int cheese;
    int sourcream;
    int salsa;

    public PatatoBuilder addSourCream(int scg){
        this.sourcream = scg;
        return this;
    }
    public PatatoBuilder addCheese(int cg){
        this.cheese = cg;
        return this;
    }
    public PatatoBuilder addSalsa(int sg){
        this.salsa = sg;
        return this;
    }
    public Patato build(){
        return new Patato(cheese, sourcream, salsa);
    }
}