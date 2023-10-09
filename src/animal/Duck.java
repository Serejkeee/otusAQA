package animal;

import commands.Flying;

public class Duck extends Animal implements Flying {
    public Duck(String name, String age, String weight, String color) {
        super(name, age, weight, color);
    }

    public String say(){
        return ("Кря");
    }
    public String  fly(){

        return ("Я лечу");
    }
}
