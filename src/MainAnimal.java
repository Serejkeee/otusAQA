//        #6) В основной программе:
//        Создайте ArrayList animal.Animal
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



import animal.Animal;
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
            System.out.println("Введите команду (например ADD, LIST, EXIT)");

            Commands command = getCommands(scanner);
            if (Commands.ADD.equals(command)) {
                System.out.println("Какое животное?");
                AnimalCommands animalCommand = getAnimalCommands(scanner);
                if (AnimalCommands.CAT.equals(animalCommand) || AnimalCommands.DOG.equals(animalCommand) || AnimalCommands.DUCK.equals(animalCommand)) {
                    createAnimal(list, scanner);
                }
            } else if (Commands.LIST.equals(command)) {
                if (list.isEmpty()) {
                    System.out.println("Животных в списке нет");
                }
                for (Animal animal : list) {
                    System.out.println(animal.toString());
                }
            } else if (Commands.EXIT.equals(command)) {
                isRunning = false;
            }
        }
    }

    private static Commands getCommands(Scanner scanner) {
        Commands commands = null;
        boolean validInput = false;
        while (!validInput) {
            try {
                commands = Commands.valueOf(scanner.nextLine().toUpperCase());
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный Ввод. Пожалуйста, введите действительную команду.");
            }
        }
        return commands;
    }

    private static AnimalCommands getAnimalCommands(Scanner scanner) {
        AnimalCommands animalCommands = null;
        boolean validInput = false;
        while (!validInput) {
            try {
                animalCommands = AnimalCommands.valueOf(scanner.nextLine().toUpperCase());
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный Ввод. Пожалуйста, введите действительную команду.");
            }
        }
        return animalCommands;
    }

    private static void createAnimal(List<Animal> list, Scanner scanner) {
        System.out.println("Спросить имя, возраст, вес, цвет");
        String name = scanner.nextLine();
        String age = getAgeAndWeight(scanner);
        String weight = getAgeAndWeight(scanner);
        String color = scanner.nextLine();
        Animal animal = new Animal(name, age, weight, color);
        list.add(animal);
        animal.say();
        System.out.println(list.toString());
    }

    private static String getAgeAndWeight(Scanner scanner) {
        String ageAndWeight = null;
        boolean validInput = false;
        while (!validInput) {
            try {
                ageAndWeight = scanner.nextLine();
                if(Integer.parseInt(ageAndWeight) <= 0) {
                    throw new IllegalArgumentException();
                }
                validInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный Ввод. Пожалуйста, введите действительную команду.");
            }
        }
        return ageAndWeight;
    }
}
