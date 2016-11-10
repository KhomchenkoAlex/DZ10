package edu.codaline.Animal;

/**
 * Created by alex on 08.11.16.
 */
 abstract public class Animal {

    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;

    int health = 50;
    private String name = this.getClass().getSimpleName(); //.replace("edu.codaline.Animal.","");

    public int getHealth() { return this.health; }

    public int eat() {
        if (health >= MAX_HEALTH) {
            System.out.println("Я не могу больше есть!!!");
        }
        else {
            System.out.println("Ням-Ням");
            health += 15;
        }
        return health;
    }

    public int sleep(){
        if (health >= MAX_HEALTH) {
            System.out.println("Я не могу больше спать!!!");
        }
        else{
            System.out.println("Хррррр");
            health += 10;
        }
        return health;
    }

    public String toString(){
        String info = "Имя: " + name + " , здоровье: " + health;
        return info;
    }
}
