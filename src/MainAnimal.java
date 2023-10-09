//        #6) В основной программе:
//        Создайте ArrayList Animal
//        ##Создайте в консоли меню, при входе в приложение на экран выводится запрос команды add/list/exit
//        Команды оформить в enum
//При вводе команды она должна быть регистронезависимой и обрезать пробелы в начале и конце
//##Если add
//        спросить какое животное(cat/dog/duck)
//        Спросить имя, возраст, вес, цвет
//        Инициализировать класс, добавить экземпляр в ArrayList и вызвать метод Say()
//        Вернуться к главному меню
//        ##Если list
//        Вывести на экран метод toString() для всех елементов массива
//        ##Если exit
//        выйти из программы



import commands.AnimalCommands;
import commands.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Введите запрос");
            Commands commands = Commands.valueOf(scanner.nextLine());
            if (Commands.ADD.equals(commands)) {
                System.out.println("Какое животное?");
                AnimalCommands animalCommands = AnimalCommands.valueOf(scanner.nextLine());
                if (AnimalCommands.CAT.equals(animalCommands)) {
                    createAnimal(list, scanner);
                }
                if (AnimalCommands.DOG.equals(animalCommands)) {
                    createAnimal(list, scanner);
                }
                if (AnimalCommands.DUCK.equals(animalCommands)) {
                    createAnimal(list, scanner);
                }
            }
            if (Commands.LIST.equals(commands)) {
                for (Animal animal : list) {
                    System.out.println(animal.toString());
                }
            }
            if (Commands.EXIT.equals(commands)) {
                isRunning = false;
            }
        }
    }

    private static void createAnimal(List<Animal> list, Scanner scanner) {
        System.out.println("Спросить имя, возраст, вес, цвет");
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String weight = scanner.nextLine();
        String color = scanner.nextLine();
        Animal animal = new Animal(name, age, weight, color);
        list.add(animal);
        animal.say();
        System.out.println(list.toString());
    }
}
