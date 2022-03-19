public class SecondApp {

    public static void main(String[] args) {

        System.out.println(checkSum(20, 0)); //проверка, что сумма двух чисел лежит в пределах от 10 от 20 (включительно)

        System.out.println(lookForPositive(0)); //проверка целого число на неотрицательность

        System.out.println(lookForNegative(-1)); //проверка целого число на отрицательность

        typeFewTimes("One more time, baby!",5); //печать введённой строки указанное количество раз

        System.out.println(isLeapYear(2000)); //определяет високосный год или нет

    }

    public static boolean checkSum(int a, int b){

        boolean result = a + b >= 10 && a + b <= 20; // 10 <= a + b <= 20
        return result;
    }

    public static boolean lookForPositive(int digit){

        boolean result = digit >= 0; //неотрицательное число
        return result;
    }

    public static boolean lookForNegative(int digit){

        boolean result = digit < 0; //отрицательное число
        return result;
    }

    public static void typeFewTimes(String someText, int howMuch){

        if (howMuch == 0) { //если число повторений равно 0, то показываем предупреждение

            System.out.println("Если  количество повторений равно 0, то и повторять нечего!");

        } else if (howMuch < 0){ //если число отрицательное, то меняем знак

            howMuch *=-1;

        } else {} // если число положительное, то ничего с ним не делаем

        for (int i = 0; i  < howMuch; i++)
        {
            System.out.println(someText); //выводим строку
        }
        return;
    }

    public static boolean isLeapYear(int year){

        boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // если год делится нацело на 4, но не на 100
        // ИЛИ
        // год делится нацело И на 4, И на 400,
        // то он високосный
        return result;
    }

}
