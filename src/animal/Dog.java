package animal;

public class Dog extends Animal {
    public Dog(String name, String age, String weight, String color) {
        super(name, age, weight, color);
    }

    public String say() {
        return ("Гав");
    }
}