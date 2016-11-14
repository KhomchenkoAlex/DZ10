package edu.codaline;

import java.util.Scanner;
import edu.codaline.Animal.*;

/**
 * Created by alex on 09.11.16.
 */
public class Menu {

    String choiseTheAnimal() {

        System.out.println();
        System.out.println("Выберите питомца:");
        System.out.println("1 - Fish " + "2 - Bird " + "3 - Cat" );

        Scanner in = new Scanner(System.in);
        String nameOfAnimal;

        while (true) {
            switch (in.nextInt()) {
                case 1:
                    System.out.println(" У вас завелась - Fish");
                    nameOfAnimal = "Fish";
                    return nameOfAnimal;
                case 2:
                    System.out.println("У вас завелась - Bird");
                    nameOfAnimal = "Bird";
                    return nameOfAnimal;
                case 3:
                    System.out.println("У вас завёлся - Cat");
                    nameOfAnimal = "Cat";
                    return nameOfAnimal;
            }
        }
    }

     void playWithFish() {
         Scanner in = new Scanner(System.in);
         Fish fish = new Fish();

        while (fish.getHealth() > 0) {

            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1 - Покормить " + "2 - Положить спать " + "3 - Плавать " + "4 - Поговорить " + "5 - Состояние " + "0 - Выход ");


            switch (in.nextInt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    fish.eat();
                    break;
                case 2:
                    fish.sleep();
                    break;
                case 3:
                    fish.swim();
                    break;
                case 4:
                    fish.blowBubbles();
                    break;
                case 5:
                    System.out.println(fish.toString());
                    break;
            }
        }
         System.out.println("Game over! Питомец заболел и его забрали в больницу(...");
    }

    void playWithBird() {
        Scanner in = new Scanner(System.in);
        Bird bird = new Bird();

        while (bird.getHealth() > 0) {

            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1 - Покормить " + "2 - Положить спать " + "3 - Летать " + "4 - Поговорить " + "5 - Состояние " + "0 - Выход ");

            switch (in.nextInt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    bird.eat();
                    break;
                case 2:
                    bird.sleep();
                    break;
                case 3:
                    bird.fly();
                    break;
                case 4:
                    bird.warble();
                    break;
                case 5:
                    System.out.println(bird.toString());
                    break;
            }
        }
        System.out.println("Game over! Питомец заболел и его забрали в больницу(...");
    }

    void playWithCat() {
        Scanner in = new Scanner(System.in);
        Cat cat = new Cat();

        while (cat.getHealth() > 0) {

            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1 - Покормить " + "2 - Положить спать " + "3 - Бегать " + "4 - Прыгать " + "5 - Состояние " + "0 - Выход ");

            switch (in.nextInt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    cat.eat();
                    break;
                case 2:
                    cat.sleep();
                    break;
                case 3:
                    cat.run();
                    break;
                case 4:
                    cat.jump();
                    break;
                case 5:
                    System.out.println(cat.toString());
                    break;
            }
        }
        System.out.println("Game over! Питомец заболел и его забрали в больницу(...");
    }
}

