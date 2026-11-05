class Animal { void makeSound() { System.out.println("Animal makes a sound."); } }
class Dog extends Animal { @Override void makeSound() { System.out.println("Dog says: Woof woof!"); } }
class Cat extends Animal { @Override void makeSound() { System.out.println("Cat says: Meow!"); } }
class Q13_AnimalSoundOverriding {
    public static void main(String[] args) { Animal a = new Dog(); Animal b = new Cat(); a.makeSound(); b.makeSound(); }
}
