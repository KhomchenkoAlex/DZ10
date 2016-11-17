package tamagochi.Animal;

/**
 * Created by alex on 08.11.16.
 */
public class Cat extends Animal {

    public Cat() {
        this.health = 75;
    }

    public int run() {
        if (health <= MIN_HEALTH + 25) {
            System.out.println("Я очень устал!!! В больничку меня....");
            this.health -= 15;
        }
        else {
            System.out.println("Туда-сюда...");
            this.health -= 15;
        }
        return this.health;
    }

    public int jump() {
        if (health <= MIN_HEALTH + 25) {
            System.out.println("Я очень устал!!! В больничку меня....");
            this.health -= 20;
        }
        else {
            System.out.println("Со стула на диван - с дивана на шкаф...");
            this.health -= 20;
        }
        return this.health;
    }
}
