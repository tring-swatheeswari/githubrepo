class Animal {
    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    public void sound() {
        System.out.println("The cat meows.");
    }
}
public class Runtime {
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal = new Dog();  
        myAnimal.sound();      
        myAnimal = new Cat();  
        myAnimal.sound();      
    }
}
