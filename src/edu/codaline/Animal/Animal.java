package edu.codaline.Animal;

/**
 * Created by alex on 08.11.16.
 */
abstract public class Animal {

    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;

    int health = 50;

    int eat() {
        if (health >= MAX_HEALTH) {
            System.out.println("Я не могу больше есть!!!");
        }
        else {
            System.out.println("Ням-Ням");
            health += 15;
        }
        return health;
    }

    int sleep(){
        if (health >= MAX_HEALTH) {
            System.out.println("Я не могу больше спать!!!");
        }
        else{
            System.out.println("Хррррр");
            health += 10;
        }
        return health;
    }

    int ToDoNothing() {
        if (health <= MIN_HEALTH + 5) {
            System.out.println("Я умираю!!! В больничку меня....");
        }
        else
            health -=5;
        return health;
    }
}
