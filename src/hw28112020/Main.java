package hw28112020;


import java.util.Scanner;
import java.lang.Math;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число, у вас 3 попытки");
        int range = 9;
        int number = (int) (Math.random() * range);
        playlevel1(range, number);
        scanner.close();
    }


    private static void playlevel1(int range, int number) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте число от 0 до " + range);
            int imput_number = scanner.nextInt();
            if (imput_number == number) {
                System.out.println("Вы угадали");
            } else if (imput_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        System.out.println("Вы не угадали!");
        System.out.println("Повторить игру? 1 - да / 0 - нет");

        System.out.println("Спасибо за игру");

    }
}
//lic class Main {
//    static Scanner sc = new Scanner(System.in);
//    static Random random = new Random();
//
//    public static void main(String[] args) {
//        do {
//            System.out.println("Ваша задача угадать число от 0 до 9, у вас 3 попытки");
//            int range = 9;
//            int answer;
//            int number = (int)(random() * range);
//            boolean guess = false;
//            for (int i = 0; i < 3; i++) {

