package edu.codaline.Animal;

/**
 * Created by alex on 08.11.16.
 */
public class Fish extends Animal {

    public Fish(){
        this.health = 35;
    }

    public int swim() {
        if (health <= MIN_HEALTH + 15) {
            System.out.println("Я умираю!!! В больничку меня....");
        }
        else {
            System.out.println("Туда-сюда...");
            this.health -= 10;
        }

        return this.health;
    }

    public int blowBubbles() {
        if (health <= MIN_HEALTH +15) {
            System.out.println("Я умираю!!! В больничку меня....");
        }
        else {
            System.out.println("Буль-буль...");
            this.health -= 5;
        }
        return this.health;
    }


}
