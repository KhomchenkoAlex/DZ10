package edu.codaline.Animal;

/**
 * Created by alex on 08.11.16.
 */
public class Bird extends Animal {

    public int fly() {
        if (health <= MIN_HEALTH + 15) {
            System.out.println("Я умираю!!! В больничку меня....");
        }
        else {
            System.out.println("Туда-сюда...");
            this.health -= 10;
        }
        return this.health;
    }

    public int warble() {
        if (health <= MIN_HEALTH + 15) {
            System.out.println("Я умираю!!! В больничку меня....");
        }
        else {
            System.out.println("Чики-чики, чик-чирик!");
            this.health -= 5;
        }
        return this.health;
    }
}
