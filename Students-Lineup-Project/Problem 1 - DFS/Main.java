import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static int x;
    private static int y;

    private static int finalDepth = 0;
    private static int numberOfNodes = 0;
    private static int numberOfexpands = 0;
    private static Pattern patternInt = Pattern.compile("[^0-9]");
    private static ArrayList<String> moves = new ArrayList<>();

    /*
    this method runs dls on the input array limited by depth
     */
    public static boolean dls(String[][] input, int n, int m, int depth) {

        if (depth < 0) {
            return false;
        }

        numberOfNodes++;


        if (goalState(input, n, m)) {
            finalDepth = depth;
            return true;
        }
        if (n > 0) {
            numberOfexpands++;
        }
        if (n < x - 1) {
            numberOfexpands++;
        }
        if (m > 0) {
            numberOfexpands++;
        }
        if (m < y - 1) {
            numberOfexpands++;
        }

        if (n > 0) {
            if (dls(move(input, n, m, "up"), n - 1, m, depth - 1)) {
                moves.add("up");
                return true;
            }
        }
        if (n < x - 1) {
            if (dls(move(input, n, m, "down"), n + 1, m, depth - 1)) {
                moves.add("down");
                return true;
            }
        }
        if (m > 0) {
            if (dls(move(input, n, m, "left"), n, m - 1, depth - 1)) {
                moves.add("left");
                return true;
            }
        }
        if (m < y - 1) {
            if (dls(move(input, n, m, "right"), n, m + 1, depth - 1)) {
                moves.add("right");
                return true;
            }
        }

        return false;
    }

    /*
    this method swaps # with a neighbour
     */
    public static String[][] move(String[][] input, int a, int b, String move) {

        String[][] output = new String[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                output[i][j] = input[i][j];
            }

        }
        String temp;

        if (move.equals("up")) {

            temp = output[a - 1][b];
            output[a - 1][b] = output[a][b];
            output[a][b] = temp;
        }
        if (move.equals("down")) {

            temp = output[a + 1][b];
            output[a + 1][b] = output[a][b];
            output[a][b] = temp;
        }
        if (move.equals("left")) {

            temp = output[a][b - 1];
            output[a][b - 1] = output[a][b];
            output[a][b] = temp;
        }
        if (move.equals("right")) {

            temp = output[a][b + 1];
            output[a][b + 1] = output[a][b];
            output[a][b] = temp;
        }

        return output;
    }


    /*
    this method checks if we reached a final state
     */
    public static boolean goalState(String[][] input, int n, int m) {

        if (m != 0) return false;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                if (j > 0) {

                    if (!input[i][j].equals("#") && !input[i][j - 1].equals("#")) {
                        if (Integer.parseInt(patternInt.matcher(input[i][j]).replaceAll("")) > Integer.parseInt(patternInt.matcher(input[i][j - 1]).replaceAll("")) ||
                                input[i][j].charAt(3) != input[i][j - 1].charAt(3)) {

                            return false;

                        }
                    }
                    if (!input[i][j].equals("#") && input[i][j - 1].equals("#") && j > 1) {
                        if (Integer.parseInt(patternInt.matcher(input[i][j]).replaceAll("")) > Integer.parseInt(patternInt.matcher(input[i][j - 2]).replaceAll("")) ||
                                input[i][j].charAt(3) != input[i][j - 2].charAt(3)) {

                            return false;

                        }
                    }
                }

            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf(input[i][j] + "   ");

            }
            System.out.println();
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /*
        x, y are dimensions of class lines
        x = number of lines
        y = number of students in each line
         */
        x = sc.nextInt();
        y = sc.nextInt();
        int depth = 0;

        int n = 0;
        int m = 0;
        String[][] input = new String[x][y];


        /*
        reading the input
         */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                input[i][j] = sc.next();
                if (input[i][j].equals("#")) {
                    n = i;
                    m = j;
                }
            }
        }


//        System.out.println("salam");
        int currentDepth = 0;
        /*
        running ids on input to reach the goal state
        each time in loop, 1 is added to limit
         */
        while (true) {
            currentDepth++;
            System.out.println(currentDepth);

            if (dls(input, n, m, currentDepth)) {

                System.out.println("Depth: " + (currentDepth - finalDepth));
                System.out.println("number of Nodes: " + numberOfexpands);
                System.out.println("number of expands: " + numberOfNodes);

                for (int i = moves.size() - 1; i >= 0; i--) {
                    System.out.println(moves.size() - i + ":  " + moves.get(i));
                }

                break;
            }

        }
//sample input:
//3 3
//150a 140a 140b
//160b 100a 140b
//180d 120d #

    }
}
