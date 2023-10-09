//#1) Создайте родительский класс
//        Animal
//        ##Свойства:
//        name, age, weight, color
//        ##Методы:
//        Getter and Setter
//        Say(Вывод на экран: "Я говорю"),
//        Go(Вывод на экран: "Я иду"),
//        Drink(Вывод на экран: "Я пью"),
//        Eat(Вывод на экран: "Я ем")
//        ##Переопределите метод toString (Возврат строки: "Привет! меня зовут name, мне age лет(/год/года), я вешу - weight кг, мой цвет - color") лет или год, или года должно быть выбрано в зависимости от числа
//        Примеры:
//        Привет! меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный
//        Привет! меня зовут Бобик, мне 1 год, я вешу - 15 кг, мой цвет - черный
//        Привет! меня зовут Бобик, мне 2 года, я вешу - 15 кг, мой цвет - черный
//        #2) Создайте интерфейс Flying
//        ##Методы:
//        Fly
//        #3) Создайте класс animal.Cat унаследуйте его от Animal
//        Переопределить метод Say(Вывод на экран: "Мяу")
//        #4) Создайте класс animal.Dog унаследуйте его от Animal
//        Переопределить метод Say(Вывод на экран: "Гав")
//        #5) Создайте класс animal.Duck унаследуйте его от Animal, реализуйте интерфейс Flying
//        Переопределить метод Say(Вывод на экран: "Кря")
//        Реализовать метод Fly(Вывод на экран: "Я лечу")


public class Animal {
    private String name;
    private String age;
    private String weight;
    private String color;

    public Animal(String name, String age, String weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String say() {
        return "Я говорю";
    }
    public String go() {
        return "Я иду";
    }
    public String drink() {
        return "Я пью";
    }
    public String eat() {
        return"Я ем";
    }

    @Override
    public String toString() {
        return "Привет! меня зовут "+ name+" , мне "+ age+ " лет, я вешу - "+ weight+ " кг, мой цвет - "+ color;
    }
}
