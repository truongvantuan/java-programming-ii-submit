
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        
        NoiseCapable cat = new Cat("MeoMeo");
        cat.makeNoise();
        
        Cat newCat = (Cat) cat;
        newCat.eat();
        
    }

}
