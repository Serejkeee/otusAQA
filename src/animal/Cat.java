package animal;

public class Cat extends Animal {
    public Cat(String name, String age, String weight, String color) {
        super(name, age, weight, color);
    }

    public String say(){
        return ("Мяу");
    }
}
