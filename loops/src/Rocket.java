public class Rocket {
    public static void main(String[] args) {
        noseCone(5);
        body(5);
        secondBody(5);
        randomLine(5);
        secondBody(5);
        body(5);
        randomLine(5);
        noseCone(5);
    }

    public static void noseCone(int size) {
        /*
         * This paragraph of code is supposed to print out the nosecone of the rocket ship
         * for loop
         *A dash and a * in each row, expanding down the nosecone until it reaches size 6
         */
        System.out.println();
        for (int row = 1; row < size; row++) {
            for (int spaces = size - row; spaces >= 0; spaces--) {
                System.out.print(" ");
            }
            for (int slashes = 0; slashes < row; slashes++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int slashes = 0; slashes < row; slashes++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void body(int size) {
        /*
         *print +*=*-*=*=*=*=*=+
         * Size six
         * One line
         */
        System.out.print("+");
        for (int spaces = 0; spaces <= size; spaces++) {
            System.out.print("*=");
        }
        System.out.print("+");
        /*
         *This is the body of the rocket ship
         * /\ and .
         * The number of triangles should be equal to the number of rows
         * The number of periods should decrease as the rows increase
         * also a for loop
         */
        for (int row = 3; row >= 1; row--) {
            System.out.println(" ");
            System.out.print("|"); //The start of each new line
            for (int j = 2; j >= 1; j--) {
                for (int dot = row - 1; dot > 0; dot--) { //The periods
                    System.out.print(".");
                }
                for (int tri = row; tri <= 3; tri++) { //The triangles
                    System.out.print("/\\");
                }
                for (int dot = row - 1; dot > 0; dot--) { //The periods
                    System.out.print(".");
                }
            }
            System.out.print("|");
        }
    }

    public static void randomLine(int size) {
        System.out.println();
        System.out.print("+");
        for (int spaces = 0; spaces <= size; spaces++) {
            System.out.print("*=");
        }
        System.out.print("+");
    }

    public static void secondBody(int size) {
        for (int row = 3; row >= 1; row--) {
            System.out.println(" ");
            System.out.print("|");
            for (int j = 2; j >= 1; j--) {
                for (int dot = row - 1; dot > 0; dot--) {
                    System.out.print(".");
                }
                for (int tri = row; tri <= 3; tri--) {
                    System.out.print("\\/");
                }
                for (int dot = row - 1; dot > 0; dot--) {
                    System.out.print(".");
                }
            }
            System.out.print("|");
        }
    }
}

