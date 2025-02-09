import java.util.Scanner;

class Animal {
    private String cls;
    private String order;
    private String genus;
    private String locomotion;

    public Animal(Scanner sc) {
        System.out.println("Enter class:");
        cls = sc.nextLine();
        System.out.println("Enter order:");
        order = sc.nextLine();
        System.out.println("Enter genus:");
        genus = sc.nextLine();
        System.out.println("Enter locomotion:");
        locomotion = sc.nextLine();
    }

    public String toString() {
        return "In class: " + cls + 
               "\nIn order: " + order + 
               "\nIn genus: " + genus + 
               "\nIn locomotion: " + locomotion + "\n";
    }
}

class Dog extends Animal {
    private String species;
    private String name;
    private String color;
    private String owner;

    public Dog(Scanner sc) {
        super(sc);
        System.out.println("Enter species:");
        species = sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter color:");
        color = sc.nextLine();
        System.out.println("Enter owner:");
        owner = sc.nextLine();
    }

    public String toString() {
        return "Dog information:\n" + super.toString() +
               "In color: " + color + 
               "\nIn species: " + species + 
               "\nIn name: " + name + 
               "\nIn owner: " + owner + "\n";
    }
}

class Cat extends Animal {
    private String species;
    private String name;
    private String color;
    private String owner;
    private int taillength;

    public Cat(Scanner sc) {
        super(sc);
        System.out.println("Enter species:");
        species = sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter color:");
        color = sc.nextLine();
        System.out.println("Enter owner:");
        owner = sc.nextLine();
        System.out.println("Enter tail length:");
        taillength = sc.nextInt();
        sc.nextLine(); // Consume newline character
    }

    public String toString() {
        return "Cat information:\n" + super.toString() +
               "In color: " + color + 
               "\nIn species: " + species + 
               "\nIn name: " + name + 
               "\nIn tail length: " + taillength + "cm" + 
               "\nIn owner: " + owner + "\n";
    }
}

public class Animal_Dog_Cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dog details");
        Dog d = new Dog(sc);
        System.out.println("Cat details");
        Cat c = new Cat(sc);

        System.out.println(d);
        System.out.println(c);

        sc.close();
    }
}
