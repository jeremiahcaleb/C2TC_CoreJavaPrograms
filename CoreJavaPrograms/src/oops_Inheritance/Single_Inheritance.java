package oops_Inheritance;

// Parent class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}

// Child class
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void showDetails() {
        display();
        System.out.println("Dog Breed: " + breed);
    }
}
