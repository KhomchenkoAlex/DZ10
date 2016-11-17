package tamagochi;

public class DZ2Main {

    public static void main(String[] args) {
        Menu menu = new Menu ();
        String s = menu.choiseTheAnimal();

        switch (s){
            case "Cat":
                menu.playWithCat();
                break;
            case "Bird":
                menu.playWithBird();
                break;
            case "Fish":
                menu.playWithFish();
                break;
        }
    }
}
