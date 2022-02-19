public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords(); // список фруктов
        checkSumSign(); // определение знака суммы
        printColor(); // вывод цвета
        compareNumbers(); // сравнение двух чисел
    }

    // метод выводит список фруктов
    public static void printThreeWords(){

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // метод определяет знак суммы двух чисел
    public static void checkSumSign(){

        // инициализируем переменные, значения выбираем на своё усмотрение
        int a = -3;
        int b = 2;

        // складываем и начинаем сравнивать с нулем
        if (a + b >= 0) {
            System.out.println("Неотрицательная сумма");
        } else {
            System.out.println("Отрицательная сумма");
        }
    }

    // метод сопоставляет числу цвет
    public static void printColor(){

        // инициализируем переменную произвольным значением
        int value = 105;

        if (value <= 0) {
            System.out.println("Red"); // красный, если значение меньше или равно 0
        } else if (value > 100) {
            System.out.println("Green"); // зеленый, если значение больше 100
        } else {
            System.out.println("Yellow"); // жёлтый, если значение больше 0, но меньше или равно 100
        }
    }

    // метод сравнивает два числа и уведомляет о сравнении
    public static void compareNumbers(){

        // инициализируем переменные, значения выбираем на свой вкус
        int a = -7;
        int b = -1;

        // сравниваем числа между собой
        if (a >= b) {
            System.out.println("a >= b"); // первое число больше или равно второму
        } else {
            System.out.println("a < b"); // второе число больше первого
        }
    }

}