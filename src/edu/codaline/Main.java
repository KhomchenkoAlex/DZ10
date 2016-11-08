package edu.codaline;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ismakechoise = false;

	    System.out.println("Выберите питомца:");
        System.out.println("1 - Fish " + "2 - Bird " + "3 - Cat");

        while(!ismakechoise) {
            switch (in.nextInt()) {
                case 1:
                    ismakechoise = true;
                    break;
                case 2:
                    ismakechoise = true;
                    break;
                case 3:
                    ismakechoise = true;
                    break;
                default:
                    ismakechoise = false;

            }
        }
    }
}
