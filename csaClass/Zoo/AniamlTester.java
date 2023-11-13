package Zoo;

public class AniamlTester {
    Mammal m = new Mammal();
    Bird b = new Bird("Tweety", 2, "Yellow");
    Animal a = new Animal();

    public static void main(String[] args) {
        Mammal m = new Mammal();
        Bird b = new Bird("Tweety", 2, "Yellow");
        Animal a = new Animal();
        AniamlTester t = new AniamlTester();
        System.out.println(m.sing());
        System.out.println(b.sing());
        System.out.println(a.sing());
    }


}
