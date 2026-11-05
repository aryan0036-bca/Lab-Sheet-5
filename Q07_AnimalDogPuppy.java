class Animal { void eat() { System.out.println("Animal is eating."); } }
class Dog extends Animal { void bark() { System.out.println("Dog is barking."); } }
class Puppy extends Dog { void play() { System.out.println("Puppy is playing."); } }
class Q07_AnimalDogPuppy {
    public static void main(String[] args) { Puppy p = new Puppy(); p.eat(); p.bark(); p.play(); }
}
