public class Rectangle {
    public static void main(String[] args) {
        printRectangle(3, 10);
    }


    public static void printRectangle(int height, int width) {
        //code
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
