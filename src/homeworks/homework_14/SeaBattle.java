package homeworks.homework_14;

import java.util.Random;
import java.util.Scanner;

/**
 * 24.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class SeaBattle {

    private static int[][] field;
    private static Random random = new Random();
    private static final int size = 10;
    private static int goodShots = 0;
    private static int countAttempts = 0;
    private static int sizeShips = 0;
    private static int shipsAmount = 0;

    public static void main(String[] args) {
        startGame();

    }

    public static void startGame() {
        field = new int[size][size];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = 0;
            }
        }

        putShips();

        readyToStart(size, sizeShips, shipsAmount);

        while (goodShots < sizeShips) {
            showField();

            int xCoordinate;
            int yCoordinate;

            xCoordinate = getCoordinateFromPlayer("вертикали");
            yCoordinate = getCoordinateFromPlayer("горизонтали");

            boolean isGoodMove = makeMove(xCoordinate, yCoordinate);

            if (isGoodMove) goodShots++;
            countAttempts++;
        }

        System.out.println("Вы нашли все корабли! Поздравляю");
        System.out.println("Кол-во ходов: " + countAttempts);
    }

    private static void showField() {
        System.out.println();
        for (int i = 0; i < field.length; i++) {

            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("   |");
                for (int j = 0; j < field.length; j++) {
                    sb.append(" ").append(j).append(" |");
                }
                System.out.println(sb);
            }
                StringBuilder res = new StringBuilder(" ").append(i).append(" |");
                for (int j = 0; j < field.length; j++) {
                    res.append(" ").append(getSymbolByIntValue(field[i][j])).append(" |");
                }
                System.out.println(res);
        }
    }

    private static char getSymbolByIntValue(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 9605;
            case 5:
                return 'X';
            case 9:
                return '*';
            default:
                return '-';
        }
    }

    private static void putShips() {
        putShip(4);
        putShip(3);
        putShip(3);
        putShip(2);
        putShip(2);
        putShip(2);
        putShip(1);
        putShip(1);
        putShip(1);
        putShip(1);
    }

    public static void putShip(int decks) {
        int x = random.nextInt(field.length - 1);
        int y = random.nextInt(field.length) - 1;

        for (int count = 0; count <= 4; count++) {
            int direction = random.nextInt(4);
            if (checkPlace(x, y, decks, direction)) {
                for (int i = 0; i < decks; i++) {
                    field[x][y] = decks;
                    switch (direction) {
                        case 0:
                            x--;
                            break;
                        case 1:
                            y++;
                            break;
                        case 2:
                            x++;
                            break;
                        case 3:
                            y--;
                            break;
                        default:
                            break;
                    }
                }
                surroundShipWithMinusOnes(decks);
                sizeShips += decks;
                shipsAmount += 1;
                return;
            }
        }
        putShip(decks);
    }
    
    /*
    directions:
    0 - up
    1 - right
    2 - down
    3 - left
     */
    private static boolean checkPlace(int x, int y, int decks, int direction) {

        try {
            for (int i = 0; i < decks ; i++) {
                if (field[x][y] != 0) {
                    return false;
                }
                switch (direction) {
                    case 0:
                        x--;
                        break;
                    case 1:
                        y++;
                        break;
                    case 2:
                        x++;
                        break;
                    case 3:
                        y--;
                        break;
                    default:
                        return false;
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            return false;
        }

        return true;
    }

    public static void surroundShipWithMinusOnes(int decks) {
        int numRows = field.length;
        int numCols = field[0].length;

        for (int x = 0; x < numRows; x++) {
            for (int y = 0; y < numCols; y++) {
                if (field[x][y] == decks) {

                    for (int row = x - 1; row <= x + 1; row++) {
                        for (int col = y - 1; col <= y + 1; col++) {
                            if (row >= 0 && row < numRows && col >= 0 && col < numCols && field[row][col] != decks) {
                                field[row][col] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    private static int getCoordinateFromPlayer(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите координату по %s (число от 1 до %d)\n", str, size);
        int coordinate = 0;

        if (scanner.hasNextInt()) {
            coordinate = scanner.nextInt();
        }

        coordinate = (coordinate >= 0 && coordinate <= size - 1) ? coordinate : getCoordinateFromPlayer(str);


        return coordinate;
    }

    private static boolean makeMove(int x, int y) {
        if (field[x][y] == 1 || field[x][y] == 2 || field[x][y] == 3 || field[x][y] == 4) {
            field[x][y] = 5;
            return true;
        } else if (field[x][y] == 0 || field[x][y] == -1) {
            field[x][y] = 9;
        }
        return false;
    }

    private static void readyToStart(int size, int sizeBoat, int boatsAmount) {
        // Выводит правила игры
        // printf -> целое число %d; строку %s, число с запятой %f
        System.out.printf("Игра морской бой ведется на квадратном поле %dx%d\n", size, size);
//        System.out.println("Игра морской бой ведется на квадратном поле " + size + "x" + size + "\n");
        System.out.printf("Количество кораблей на поле: %d\n", boatsAmount);
//        System.out.println("Количество кораблей на поле: " + boatsAmount);
        System.out.println("Игрок вводит координаты поля");
        System.out.println("Программа отображает историю ходов и их результативность на игровом поле");
        System.out.println("Игра заканчивается, когда все корабли найдены");
        System.out.println("Удачи!");
        System.out.println("Для получения подсказки - введите 911 при вводе координат");
        System.out.println("=========================================================");
        System.out.println();

    }
}