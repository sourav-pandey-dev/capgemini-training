package javaCollectionDay1;

import java.util.Random;
import java.util.Scanner;

public class SnakeGame {

    public static void main(String[] args) throws Exception {

        int size = 10;
        int x = 5, y = 5;

        Random random = new Random();
        int preyX = random.nextInt(size);
        int preyY = random.nextInt(size);

        char direction = 'd';
        boolean lose = false;

        Scanner sc = new Scanner(System.in);

        while (!lose) {

            if (System.in.available() > 0) {
                char input = sc.next().charAt(0);
                if (input == 'w' || input == 'a' || input == 's' || input == 'd') {
                    direction = input;
                }
            }

            switch (direction) {
                case 'w': x--; break;
                case 's': x++; break;
                case 'a': y--; break;
                case 'd': y++; break;
            }

            if (x < 0 || y < 0 || x >= size || y >= size) {
                System.out.println("Game Over! Snake hit the boundary.");
                break;
            }

            if (x == preyX && y == preyY) {
                preyX = random.nextInt(size);
                preyY = random.nextInt(size);
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == x && j == y) System.out.print("S ");
                    else if (i == preyX && j == preyY) System.out.print("P ");
                    else System.out.print(". ");
                }
                System.out.println();
            }

            System.out.println();
            Thread.sleep(300);
        }

        sc.close();
    }
}
