import java.util.*;
import java.util.regex.Pattern;

/**
 * a Node shows a state and contains a String Array of students
 */
class Node {

    private String[][] strings = new String[Main.x][Main.y];
    private boolean seen;
    private ArrayList<String> moves = new ArrayList<>();

    private int xLoc = 0, yLoc = 0;

    public Node(String[][] input, ArrayList<String> moves) {

        if (moves != null) {
            if (!moves.isEmpty()) {
                this.moves.addAll(moves);
            }
        } else {
            this.moves = new ArrayList<>();
        }
        seen = false;

        for (int i = 0; i < Main.x; i++) {
            for (int j = 0; j < Main.y; j++) {
                strings[i][j] = input[i][j];
                if (strings[i][j].equals("#")) {
                    xLoc = i;
                    yLoc = j;
                }
            }

        }
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public boolean isSeen() {
        return seen;
    }

    public boolean equal(String[][] input) {
        for (int i = 0; i < Main.x; i++) {
            for (int j = 0; j < Main.y; j++) {
                if (!strings[i][j].equals(input[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public String[][] getStrings() {
        return strings;
    }

    public ArrayList<String> getMoves() {
        ArrayList<String> outArr = new ArrayList<>();
        if (!moves.isEmpty())
            outArr.addAll(moves);
        return outArr;
    }

    public Node getLeft() {

        if (yLoc > 0) {
            ArrayList<String> tempMoves = new ArrayList<>();
            tempMoves.add("left");
            return new Node(move(this.getStrings(), xLoc, yLoc, "left"), tempMoves);
        } else return null;
    }

    public Node getRight() {

        if (yLoc < Main.y - 1) {
            ArrayList<String> tempMoves = new ArrayList<>();
            tempMoves.add("right");
            return new Node(move(this.getStrings(), xLoc, yLoc, "right"), tempMoves);
        } else return null;
    }

    public Node getUp() {

        if (xLoc > 0) {
            ArrayList<String> tempMoves = new ArrayList<>();
            tempMoves.add("up");
            return new Node(move(this.getStrings(), xLoc, yLoc, "up"), tempMoves);
        } else return null;
    }

    public Node getDown() {

        if (xLoc < Main.x - 1) {
            ArrayList<String> tempMoves = new ArrayList<>();
            tempMoves.add("down");
            return new Node(move(this.getStrings(), xLoc, yLoc, "down"), tempMoves);
        } else return null;
    }


    /**
     * this method takes an action on a given node and makes the next state
     * <p>
     * //     * @param node
     *
     * @param a
     * @param b
     * @param move
     * @return
     */
    public static String[][] move(String[][] input, int a, int b, String move) {

        String[][] output = new String[Main.x][Main.y];
        for (int i = 0; i < Main.x; i++) {
            for (int j = 0; j < Main.y; j++) {
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

//        return new Node(output, new ArrayList<>());
        return output;
    }/* End of function move */


}

class Queue {

    private final int number = 0;
    private ArrayList<Node> nodes = new ArrayList<>();

    public Queue(Node node) {
        this.nodes.add(node);
    }

    public void add(Node node) {
        this.nodes.add(node);
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }


    public int getNumber() {
        return number;
    }

    public void removeFirst() {
        nodes.remove(nodes.get(0));
    }

    public boolean isEmpty() {
        if (nodes.size() != 0) {
            return false;
        }
        return nodes.isEmpty();
    }

    public int getSize() {
        return nodes.size();
    }

    public Node pop() {
        return nodes.get(0);
    }

    public boolean contain(Node node) {
        for (Node temp : nodes
        ) {
            if (temp.equal(node.getStrings())) {
                return true;
            }
        }
        return false;
    }

    public Node getNode(Node node) {
        for (Node temp : nodes
        ) {
            if (temp.equal(node.getStrings())) {
                return temp;
            }
        }
        return null;
    }
}

public class Main {

    static int product = 0;
    static int expand = 0;

    static int x;
    static int y;


    /**
     * this function finds a goal state of input array
     *
     * @param node is the given state
     * @return is a goal state as a node
     */
    public static Node findFinal(Node node) {

        String[][] fin = node.getStrings();

        Pattern patternInt = Pattern.compile("[^0-9]");

        boolean done = false;
        ArrayList<Character> chars = new ArrayList<>();
        HashMap<Character, Integer> hash = new HashMap<>();
        char minChar = '#';

        /*
        this part saves class names in an array list
        and the number of students from each class (except #) in a HashMap
        and also finds character of the class with minimum number of students
         */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!fin[i][j].equals("#")) {

                    if (!chars.contains(fin[i][j].charAt(3))) {
                        chars.add(fin[i][j].charAt(3));
                        hash.put(fin[i][j].charAt(3), 1);
                        if (minChar == '#') {
                            minChar = fin[i][j].charAt(3);
                        } else if (hash.get(fin[i][j].charAt(3)) < hash.get(minChar))
                            minChar = fin[i][j].charAt(3);

                    } else {
                        hash.replace(fin[i][j].charAt(3), hash.get(fin[i][j].charAt(3)) + 1);
                        if (hash.get(fin[i][j].charAt(3)) < hash.get(minChar)) {
                            minChar = fin[i][j].charAt(3);
                        }
                    }
                }
            }
        }/* End of for i */


        String[][] fout = new String[x][y];
        int s = 0, d = 0;


        /*
        this part puts students of same class in a same line
        and also puts # at the beginning of the class with minimum number of students
         */
        for (int k = 0; k < x; k++) {

            d = 0;

            if (chars.get(k).equals(minChar)) {
                fout[s][d] = "#";
                d++;
            }

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {

                    if (!fin[i][j].equals("#")) {

                        if (chars.get(k).equals(fin[i][j].charAt(3))) {
                            fout[s][d] = fin[i][j];
                            d++;
                        }

                    }

                }
            }
            s++;
        }/* End of for k */


        /*
        this parts sorts each line of students by their height
         */
        for (int k = 0; k < x; k++) {

            for (int i = 0; i < y - 1; i++) {
                if (!fout[k][i].equals("#")) {
                    for (int j = i + 1; j < y; j++) {
                        if (Integer.parseInt(patternInt.matcher(fout[k][j]).replaceAll("")) > Integer.parseInt(patternInt.matcher(fout[k][i]).replaceAll(""))) {
                            String temp = fout[k][i];
                            fout[k][i] = fout[k][j];
                            fout[k][j] = temp;
                        }
                    }
                }
            }

        }/* End of for k */


        /*
        printing final state
         */
        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf(fout[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        return new Node(fout, new ArrayList<>());

    }/* End of function findFinal */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        x = sc.nextInt();
        y = sc.nextInt();

        int n = 0;
        int m = 0;
        String[][] input = new String[x][y];



        /*
        reading the input data
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


        /*
        this part initializes Sfrontier and Ffrontier
         */
        Node start = new Node(input, new ArrayList<>());
        Queue sFrontier = new Queue(start);
//        String[][] done_str = new String[x][y];
//        done_str[0][0]
//        Node done = new Node(, new ArrayList<>())
        Queue fFrontier = new Queue(findFinal(start));
        product += 2;


        int depth = 0;


        /*
        bidirectional search
         */
        while (true) {

            /*
            condition of stopping program
            program stops if any of frontier queues are empty
             */
            if (sFrontier.isEmpty() || fFrontier.isEmpty()) {
                break;
            }

            Node temp = sFrontier.pop();


            /*
            this part checks if f frontier includes the node from s frontier
            then prints depth, number of nodes that have been produced and number of nodes that have been expanded
            and moves
             */
            if (fFrontier.contain(temp)) {

                Node fNode = fFrontier.getNode(temp);

                System.out.println("Depth =  " + depth);
                System.out.println("number of produced nodes =  " + product);
                System.out.println("number of expanded nodes =  " + expand);

                for (int i = temp.getMoves().size() - 1; i >= 0; i--) {
                    System.out.println(temp.getMoves().size() - i + ":  " + temp.getMoves().get(i));
                }
                for (int i = 0; i < fNode.getMoves().size(); i++) {
                    System.out.println(i + temp.getMoves().size() + ":  " + fNode.getMoves().get(i));
                }
                break;
            }
            depth++;


            /*
            expand of s frontier
             */
            if (temp.getLeft() != null) {
                sFrontier.add(temp.getLeft());
                product++;
            }
            if (temp.getRight() != null) {
                sFrontier.add(temp.getRight());
                product++;
            }
            if (temp.getUp() != null) {
                sFrontier.add(temp.getUp());
                product++;
            }
            if (temp.getDown() != null) {
                sFrontier.add(temp.getDown());
                product++;
            }

            expand++;
            sFrontier.removeFirst();

            /*
            condition of stopping program
            program stops if any of frontier queues are empty
             */
            if (sFrontier.isEmpty() || fFrontier.isEmpty()) {
                break;
            }


            Node fTemp = fFrontier.pop();

            /*
            this part checks if s frontier includes the node from f frontier
            then prints depth, number of nodes that have been produced and number of nodes that have been expanded
            and moves
             */
            if (sFrontier.contain(fTemp)) {

                Node sNode = sFrontier.getNode(fTemp);

                System.out.printf("Depth =  " + depth);
                System.out.println();
                System.out.println("number of produced nodes =  " + product);
                System.out.println("number of expanded nodes =  " + expand);


                for (int i = fTemp.getMoves().size() - 1; i >= 0; i--) {
                    System.out.println(fTemp.getMoves().size() - i + ":  " + fTemp.getMoves().get(i));
                }
                System.out.println();

                for (int i = 1; i <= sNode.getMoves().size(); i++) {
                    System.out.println(i + fTemp.getMoves().size() + ":  " + sNode.getMoves().get(i - 1));
                }
                break;
            }

            /*
            expand of f frontier
             */
            if (fTemp.getLeft() != null) {
                fFrontier.add(fTemp.getLeft());
                product++;
            }
            if (fTemp.getRight() != null) {
                fFrontier.add(fTemp.getRight());
                product++;
            }


            if (fTemp.getUp() != null) {
                fFrontier.add(fTemp.getUp());
                product++;
            }


            if (fTemp.getDown() != null) {
                fFrontier.add(fTemp.getDown());
                product++;
            }

            expand++;
            fFrontier.removeFirst();
        }
//sample input:

//2 2
//# 150a
//160a 170b
//
    }
}
