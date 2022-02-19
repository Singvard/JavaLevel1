public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = -3;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Positive sum");
        } else {
            System.out.println("Negative sum");
        }
    }
    public static void printColor(){
        int value = 105;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Green");
        } else {
            System.out.println("Yellow");
        }
    }
    public static void compareNumbers(){
        int a = -7;
        int b = -1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
