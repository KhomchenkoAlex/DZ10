import java.util.*;

public class DZ1Main {

    static int readValue(){
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        return f;
    }

    static int inputValue(){
        int value = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                value = readValue();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Value must be a digit");
                validInput = false;
            }
        }
        return value;
    }

    static boolean isEven(int a){
        if (a%2 == 0)
            return true;
        else return false;
    }

    static long factorial(int a){
        long factorial = 1;
        if (a == 0)
            System.out.println(a+"! = "+1);
        if (a < 0 || a > 20)
            System.out.println("Число должно быть от 0 до 20!");
        else{
            for( int i = 2; i <= a; i++){
                factorial *=i;
            }
        }
        return factorial;
    }

    static float averageOfArray(int a){
        int[] array = new int[a];
        int sum = 0;
        for (int i: array){
            i = (int)(Math.random()*10);
            System.out.print(i+" ");
            sum+=i;
        }
        return (float)sum/a;
    }

    static void getPriceByCode(int code){
        switch(code){
            case 111:
                System.out.println("Пиво по 12.5 грн.");
                break;
            case 222:
                System.out.println("Сок томатный по 21 грн.");
                break;
            case 333:
                System.out.println("Молоко по 14 грн.");
                break;
            case 444:
                System.out.println("Вода по 8 грн.");
                break;
            default:
                System.out.println("Товара с таким кодом несуществует!");
        }

    }


    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        int n = inputValue();
        if (isEven(n))
            System.out.println("Число " + n + " четное.");
        else System.out.println("Число " + n + " нечетное.");

        System.out.println("Введите целое положительное число от 0 до 20 для вычисления факториала:");
        int f = inputValue();
        System.out.println(factorial(f));

        System.out.println("Введите размер массива:");
        int s = inputValue();
        System.out.format("%nСреднее арифметическое массива - %.3f%n", averageOfArray(s));

        System.out.println("Введите код товара:");
        getPriceByCode(inputValue());
    }
}
