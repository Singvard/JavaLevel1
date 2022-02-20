public class SecondApp {

    public static void main(String[] args) {

	    checkSum(20, 0); //проверка, что сумма двух чисел лежит в пределах от 10 от 20 (включительно)

	    lookForPositive(0); //проверка целого число на неотрицательность

        lookForNegative(-1); //проверка целого число на отрицательность

	    typeFewTimes("One more time, baby!",5); //печать введённой строки указанное количество раз

        ifLeapYear(1956); //определение високосного года

    }

    public static boolean checkSum(int a, int b){

        boolean result = a + b >= 10 && a + b <= 20; // 10 <= a + b <= 20
        System.out.println(result);
        return result;
    }

    public static boolean lookForPositive(int digit){

        boolean result = digit >= 0; //неотрицательное число
        System.out.println(result);
        return result;
    }

    public static boolean lookForNegative(int digit){

        boolean result = digit < 0; //отрицательное число
        System.out.println(result);
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
    }

    public static boolean ifLeapYear(int year){

        boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(result);
        return result;
    }


}
