import java.util.Random;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Lesson4 {

    public static void main(String[] args) {
	    String[][] map = initField(3);
        boolean isGameActive = true;
        System.out.println("Игра началась!");

        while (isGameActive) {
            playerTurn(map);
            printMap(map);
            if (isWinner("x", map)) {
                isGameActive = false;
                break;
            }
            if (isDraw(map)) {
                isGameActive = false;
                break;
            }

            computerTurn(map);
            printMap(map);
            if (isWinner("0", map)) {
                isGameActive = false;
                break;
            }
        }
    }

    public static boolean isWinner(String mark, String[][] map) {

        int maindiag = 0;
        int mindiag = 0;
        for (int i = 0; i < map.length; i++) {
            int str = 0;
            int col = 0;
            for (int j = 0; j < map.length; j++){
                if (map[i][j] == mark){
                    str++;
                    if (str == map.length) {
                        System.out.println(mark + " победил");
                        return true;
                    }
                }
                if (map[j][i] == mark) {
                    col++;
                    if (col == map.length) {
                        System.out.println(mark + " победил");
                        return true;
                    }
                }
            }
            if (map[i][i] == mark){
                maindiag++;
                if (maindiag == map.length){
                    System.out.println(mark + " победил");
                    return true;
                }
            }
            if (map[i][map.length-i-1] == mark){
                mindiag++;
                if (mindiag == map.length){
                    System.out.println(mark + " победил");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw(String[][] map) {
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья!");
        return true;
    }

    public static void playerTurn(String[][] map) {

        System.out.println("Ваш ход");

        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x > 0 && x <= map.length) && (y > 0 && y <= map.length)) {
                if (map[x-1][y-1].equals("*")) {
                    map[x-1][y-1] = "x";
                    isActiveTurn = false;
                } else {
                    System.out.println("Ячейка уже заполнена!");
                }
            } else System.out.println("Такой ячейки нет!");
        }
    }

    public static void computerTurn(String[][] map) {
        System.out.println("Ход компьютера");
        boolean isActiveTurn = true;

        //пытаемся захватить центр, если это возможно
        int centre = (int)Math.round(map.length/2);
        if (map[centre][centre] == "*"){
            map[centre][centre] = "0";
            isActiveTurn = false;
            return;
        }

        //пытаемся атаковать
        int gdiag = 0;
        int bdiag = 0;
        int gast = 0;
        int bast = 0;

        for (int i = 0; i < map.length; i++){

            int str = 0;
            int strast = 0;
            int col = 0;
            int colast = 0;

            for (int j = 0; j < map.length; j++){
                //проверяем строку на заполненность
                if (map[i][j] == "0"){
                    str++;
                } else if (map[i][j] == "*"){
                    strast++;
                }
                if (str == (map.length-1) && strast == 1){
                    for (int k = 0; k < map.length; k++){
                        if (map[i][k] == "*"){
                            map[i][k] = "0";
                            isActiveTurn = false;
                            return;
                        }
                    }
                }

                //проверяем столбец на заполненность
                if (map[j][i] == "0"){
                    col++;
                } else if (map[j][i] == "*"){
                    colast++;
                }
                if (col == (map.length-1) && colast == 1){
                    for (int k = 0; k < map.length; k++){
                        if (map[k][i] == "*"){
                            map[k][i] = "0";
                            isActiveTurn = false;
                            return;
                        }
                    }
                }
            }

            //проверяем главную диагональ на заполненность
            if (map[i][i] == "0"){
                gdiag++;
            } else if (map[i][i] == "*"){
                gast++;
            }
            if (gdiag == (map.length-1) && gast == 1){
                for (int k = 0; k < map.length; k++){
                    if (map[k][k] == "*"){
                        map[k][k] = "0";
                        isActiveTurn = false;
                        return;
                    }
                }
            }

            //проверяем побочную диагональ на заполненность
            if (map[i][map.length-i-1] == "0"){
                bdiag++;
            } else if (map[i][map.length-i-1] == "*"){
                bast++;
            }
            if (bdiag == (map.length-1) && bast == 1){
                for (int k = 0; k < map.length; k++){
                    if (map[k][map.length-k-1] == "*"){
                        map[k][map.length-k-1] = "0";
                        isActiveTurn = false;
                        return;
                    }
                }
            }
        }
        //пытаемся защититься от атаки
        int maindiag = 0;
        int mindiag = 0;
        int mainast = 0;
        int minast = 0;

        for (int i = 0; i < map.length; i++){

            int str = 0;
            int strast = 0;
            int col = 0;
            int colast = 0;

            for (int j = 0; j < map.length; j++){
                //проверяем строку на заполненность
                if (map[i][j] == "x"){
                    str++;
                } else if (map[i][j] == "*"){
                    strast++;
                }
                if (str == (map.length-1) && strast == 1){
                    for (int k = 0; k < map.length; k++){
                        if (map[i][k] == "*"){
                            map[i][k] = "0";
                            isActiveTurn = false;
                            return;
                        }
                    }
                }

                //проверяем столбец на заполненность
                if (map[j][i] == "x"){
                    col++;
                } else if (map[j][i] == "*"){
                    colast++;
                }
                if (col == (map.length-1) && colast == 1){
                    for (int k = 0; k < map.length; k++){
                        if (map[k][i] == "*"){
                            map[k][i] = "0";
                            isActiveTurn = false;
                            return;
                        }
                    }
                }
            }

            //проверяем главную диагональ на заполненность
            if (map[i][i] == "x"){
                maindiag++;
            } else if (map[i][i] == "*"){
                mainast++;
            }
            if (maindiag == (map.length-1) && mainast == 1){
                for (int k = 0; k < map.length; k++){
                    if (map[k][k] == "*"){
                        map[k][k] = "0";
                        isActiveTurn = false;
                        return;
                    }
                }
            }

            //проверяем побочную диагональ на заполненность
            if (map[i][map.length-i-1] == "x"){
                mindiag++;
            } else if (map[i][map.length-i-1] == "*"){
                minast++;
            }
            if (mindiag == (map.length-1) && minast == 1){
                for (int k = 0; k < map.length; k++){
                    if (map[k][map.length-k-1] == "*"){
                        map[k][map.length-k-1] = "0";
                        isActiveTurn = false;
                        return;
                    }
                }
            }
        }
        //конец защиты
        //если смены хода ранее не произошло, то произвольно ставим 0
        Random random = new Random();

        while (isActiveTurn) {

            int x = random.nextInt(map.length);
            int y = random.nextInt(map.length);

            if (map[x][y].equals("*")) {
                map[x][y] = "0";
                isActiveTurn = false;
            }
        }
    }

    public static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] initField(int size){
        String[][] map = new String[size][size];

        for (int i =0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";
            }
        }
        return map;
    }
}
