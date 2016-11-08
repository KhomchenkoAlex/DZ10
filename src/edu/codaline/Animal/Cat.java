package edu.codaline.Animal;

/**
 * Created by alex on 08.11.16.
 */
public class Cat extends Animal {

    Cat() {
        this.health = 75;
    }

    int run() {
        if (health <= MIN_HEALTH + 15) {
            System.out.println("Я умираю!!! В больничку меня....");
        }
        else {
            System.out.println("Туда-сюда...");
            this.health -= 15;
        }
        return this.health;
    }

    int jump() {
        if (health <= MIN_HEALTH + 20) {
            System.out.println("Я умираю!!! В больничку меня....");
        }
        else {
            System.out.println("Со стула на диван - с дивана на шкаф...");
            this.health -= 20;
        }
        return this.health;
    }
}
