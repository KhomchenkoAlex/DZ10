package edu.codaline;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu ();
        String s = menu.choiseTheAnimal();

        switch (s){
            case "Cat":
                menu.playCat();
                break;
            case "Bird":
                menu.playBird();
                break;
            case "Fish":
                menu.playFish();
                break;
        }
    }
}
