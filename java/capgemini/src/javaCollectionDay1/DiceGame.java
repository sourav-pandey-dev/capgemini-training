package javaCollectionDay1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        boolean win = false;
        int boardSize = 52;

        Map<String, Integer> startPosition = new HashMap<>();
        startPosition.put("GREEN", 0);
        startPosition.put("RED", 13);
        startPosition.put("YELLOW", 26);
        startPosition.put("BLUE", 39);

        Map<String, Integer> currentPosition = new HashMap<>();
        currentPosition.putAll(startPosition);

        String[] players = {"GREEN", "RED", "YELLOW", "BLUE"};
        int turn = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (!win) {

            String player = players[turn];

            System.out.println("\n" + player + "'s turn. Press ENTER to roll the dice...");
            scanner.nextLine();

            int dice = random.nextInt(6) + 1;

            int oldPos = currentPosition.get(player);
            int tentativePos = oldPos + dice;

            int startPos = startPosition.get(player);


            if (oldPos < startPos && tentativePos >= startPos + boardSize) {
                System.out.println(player + " cannot move (second round not allowed)");
            } else {

                int newPos = tentativePos % boardSize;

                // 🔥 Kill logic
                for (String other : players) {
                    if (!other.equals(player) && currentPosition.get(other) == newPos) {
                        currentPosition.put(other, startPosition.get(other));
                        System.out.println(player + " killed " + other + "!");
                    }
                }

                currentPosition.put(player, newPos);

                System.out.println(player + " rolled " + dice);
                System.out.println(player + " moved from " + oldPos + " to " + newPos);

                // 🏆 Win condition (exactly reaches start again)
                if (newPos == startPos && oldPos != newPos) {
                    win = true;
                    System.out.println("\n" + player + " WINS!");
                }
            }

            System.out.println("\nCurrent Positions:");
            for (String p : players) {
                System.out.println(p + " -> " + currentPosition.get(p));
            }

            turn = (turn + 1) % players.length;
        }

        scanner.close();
    }
}
