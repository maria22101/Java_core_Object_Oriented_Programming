package edx_javacore_2_module_1_project_Battle_ships;

import java.util.Random;
import java.util.Scanner;

public class BattleShip {

    static char[][] generateOceanMap() {
        char[][] oceanMap = new char[12][14];
        for (int i = 0; i < oceanMap.length; i++) {
            for (int j = 0; j < oceanMap[i].length; j++) {

                if (i == 0 || i == oceanMap.length - 1) {
                    if (j != 0 && j != 1 && j != oceanMap[i].length - 1 && j != oceanMap[i].length - 2) {
                        oceanMap[i][j] = (char) (j - 2 + '0');
                    }
                } else {
                    if (j == 0 || j == oceanMap[i].length - 1) {
                        oceanMap[i][j] = (char) (i - 1 + '0');
                    } else {
                        if (j == 1 || j == oceanMap[i].length - 2) {
                            oceanMap[i][j] = '|';
                        }
                    }
                }

            }
        }
        return oceanMap;
    }

    static void displayOceanMap(char[][] ch) {
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                if ((i != 0) && (i != ch.length - 1)
                        && (j != 0)
                        && (j != ch[i].length - 1)
                        && (ch[i][j] == '1')) {
                    System.out.print('@');
                } else {
                    System.out.print(ch[i][j]);
                }
            }
            System.out.println();
        }
    }

    static void askUserToDeployShips(char[][] ch) {
        Scanner scanner = new Scanner(System.in);
        int shipsCount = 1;
        int x;
        int y;
        while (shipsCount <= 5) {

            do {
                System.out.printf("Enter your coordinates (within 0-9) for your ship #%d \n", shipsCount);
                System.out.print("Enter X coordinate: ");
                x = scanner.nextInt();
                System.out.print("Enter Y coordinate: ");
                y = scanner.nextInt();
            } while (x < 0 || x > 9 || y < 0 || y > 9);

            if (ch[y + 1][x + 2] == '1') {
                System.out.println("A ship is already there");
                continue;
            }
            ch[y + 1][x + 2] = '1';
            shipsCount++;
        }
    }

    static void askComputerToDeployShips(char[][] ch) {
        int shipsCount = 1;
        int x;
        int y;

        while (shipsCount <= 5) {

            do {
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);
            } while (x < 0 || x > 9 || y < 0 || y > 9);

            if (ch[y + 1][x + 2] == '1' || ch[y + 1][x + 2] == '2') {
                continue;
            }

            ch[y + 1][x + 2] = '2';
            System.out.printf("%d. ship deployed at %d, %d coordinate \n", shipsCount, x, y);
            shipsCount++;
        }
    }

    public static void main(String[] args) {
        char[][] oceanMap = generateOceanMap();
        displayOceanMap(oceanMap);
        askUserToDeployShips(oceanMap);
        askComputerToDeployShips(oceanMap);
        displayOceanMap(oceanMap);

    }
}
