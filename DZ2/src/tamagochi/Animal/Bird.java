package tamagochi.Animal;

/**
 * Created by alex on 08.11.16.
 */
public class Bird extends Animal {

    public int fly() {
        if (health <= MIN_HEALTH + 15) {
            System.out.println("Я очень устала!!! В больничку меня....");
            this.health -= 10;
        }
        else {
            System.out.println("Туда-сюда...");
            this.health -= 10;
        }
        return this.health;
    }

    public int warble() {
        if (health <= MIN_HEALTH + 15) {
            System.out.println("Я очень устала!!! В больничку меня....");
            this.health -= 5;
        }
        else {
            System.out.println("Чики-чики, чик-чирик!");
            this.health -= 5;
        }
        return this.health;
    }
}
