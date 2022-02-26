import java.util.Scanner;

public class ThirdApp {

    public static void main(String[] args) {
        invertBits();
        fromOneToHundred();
        multiplyByTwo();
        generateSquareArray();
        generateSimpleArray();
        findMinAndMax();
        System.out.println(couldBeHalved());
        shiftElements();
    }

    //МЕТОД 1
    //Вводим массив с клавиатуры и инвертируем его
    public static void invertBits(){

        Scanner sc = new Scanner(System.in); //создаем сканер
        int size; //длина массива

        do {
            System.out.println("Укажите желаемую длину массива (должна быть больше 0): ");
            size = sc.nextInt(); //забираем число из консоли
        } while (size <= 0); //длина массива должна быть положительной
        int[] arr = new int[size]; //объявляем массив указанной длины

        System.out.println("Задайте массив, вводя 0 или 1 и нажимая клавишу Enter. Любые другие числа превратятся в 1");

        for (int i =0; i < size; i++) {

            int element = sc.nextInt(); //забираем число из консоли
            if (element == 0 || element == 1) {
                arr[i] = element; //если 0 или 1, то добавляем в массив
            } else {
                System.out.println("Число заменено на 1");
                arr[i] = 1; //если отлично от 0 и 1, то превращаем в 1 и тоже добавляем в массив
            }
        }
        sc.close(); //закрываем сканер

        System.out.print("Введённый массив:");
        for (int i : arr)
            System.out.print(" " + i); //выводим на экран, то что ввели

        System.out.print( "\nИнвертный массив:");

        for (int i : arr) {
            switch (i) {
                case 0:
                    i = 1; //если элемент массива = 0, то заменяем на 1
                    break;
                case 1:
                    i = 0; //если элемент массива = 1, то заменяем на 0
                    break;
            }
            System.out.print(" " + i); //выводим обработанный массив
        }
        System.out.println(); //бахаем пустую строку на всякий случай, т.к. до этого был print

    }

    //МЕТОД 2
    //Генерируем массив от 0 до 100
    public static void fromOneToHundred(){

        int [] HugeArray = new int [100];

        for (int i = 0; i < 100; i++){
            HugeArray[i] = 1 + i;
            //System.out.print(HugeArray[i] + " "); //для проверки работы метода
        }
    }

    //МЕТОД 3
    //умножаем те элементы массива, что меньше 6 на 2
    public static void multiplyByTwo(){
        int [] NumSet = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < NumSet.length; i++){
            if (NumSet[i] < 6) {
                NumSet[i] *= 2;
            }
            //System.out.print(NumSet[i] + " "); //для проверки работы метода
        }
    }

    //МЕТОД4
    //Генерация квадратного массива
    public static void generateSquareArray(){
        Scanner sc = new Scanner(System.in); //создаем сканер
        int size; //длина массива

        do {
            System.out.println("Укажите желаемую длину массива (должна быть больше 0): ");
            size = sc.nextInt(); //забираем число из консоли
        } while (size <= 0); //длина массива должна быть положительной
        int[][] arr = new int[size][size]; //объявляем квадратный массив указанной длины

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if ((i == j) || (i + j == size - 1)){
                    arr[i][j] = 1; //если элементы находятся на диагоналях, то он равен 1
                } else {
                    arr[i][j] = 0; //во всех остальных случаях заполняем нулями
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); //бахаем пустую строку
        }
    }
    //МЕТОД5
    //Генерация квадратного массива
    public static void generateSimpleArray() {
        Scanner sc = new Scanner(System.in); //создаем сканер
        int len; //длина массива

        do {
            System.out.println("Укажите желаемую длину массива (должна быть больше 0): ");
            len = sc.nextInt(); //забираем число из консоли
        } while (len <= 0); //длина массива должна быть положительной

        System.out.println("Укажите число, которым будет заполнен массив");
        int initialValue = sc.nextInt();
        int arr[] = new int [len];
        for (int i : arr) {
            i = initialValue;
            //System.out.println(i); //для проверки метода
        }
    }

    //МЕТОД 6
    //Вводим массив с клавиатуры и ищем в нём наибольший и наименьший элемент
    public static void findMinAndMax(){

        Scanner sc = new Scanner(System.in); //создаем сканер
        int size; //длина массива

        do {
            System.out.println("Укажите желаемую длину массива (должна быть больше 0): ");
            size = sc.nextInt(); //забираем число из консоли
        } while (size <= 0); //длина массива должна быть положительной
        int[] arr = new int[size]; //объявляем массив указанной длины

        System.out.println("Задайте массив, вводя целые числа и нажимая клавишу Enter.");

        for (int i =0; i < size; i++) {
            int element = sc.nextInt(); //забираем число из консоли
            arr[i] = element; // добавляем в массив
            }
        sc.close(); //закрываем сканер

        int max = arr[0];
        int min = arr[0];

        for (int i : arr){
            if (max < i) {
                max = i;
            } else if (min > i){
                min = i;
            } else{}
        }
        System.out.println("min = " + min + ", max = " + max);
    }

    //МЕТОД 7
    //Вводим массив с клавиатуры и определяем можно ли его разбить на 2 арифметически равные части
    public static boolean couldBeHalved(){

        Scanner sc = new Scanner(System.in); //создаем сканер
        int size; //длина массива

        do {
            System.out.println("Укажите желаемую длину массива (должна быть больше 0): ");
            size = sc.nextInt(); //забираем число из консоли
        } while (size <= 0); //длина массива должна быть положительной
        int[] arr = new int[size]; //объявляем массив указанной длины

        System.out.println("Задайте массив, вводя целые числа и нажимая клавишу Enter.");

        int summ = 0;
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt(); //забираем число из консоли
            arr[i] = element; // добавляем в массив
            summ += arr[i]; //и заодно считаем сумму всех элементов массива
        }
        sc.close(); //закрываем сканер
        boolean result = false;
        for (int i = 0; i < size; i++){
            if (i == 0){} // первая сумма равна первому элементу массива
            else {
                arr[i] += arr[i-1]; //последующие суммы равны сумме текущего элемента массива с предыдущей суммой
            }
            if (arr[i] == summ/2){ //если текущая сумма элементов равна полусумме всего массива, то это успех
              result = true;
              break;
            } else{}
        }
        return result;
    }

    //МЕТОД 8
    //Вводим массив с клавиатуры и сдвигаем его на заданное количество единиц вправо или влево
    public static void shiftElements(){

        Scanner sc = new Scanner(System.in); //создаем сканер
        int size; //длина массива

        do {
            System.out.println("Укажите желаемую длину массива (должна быть больше 0): ");
            size = sc.nextInt(); //забираем число из консоли
        } while (size <= 0); //длина массива должна быть положительной
        int[] arr = new int[size]; //объявляем массив указанной длины

        System.out.println("Задайте массив, вводя целые числа и нажимая клавишу Enter.");

        for (int i = 0; i < size; i++) {
            int element = sc.nextInt(); //забираем число из консоли
            arr[i] = element; // добавляем в массив
        }

        System.out.println("Введите шаг смещения (положительный для сдвига вправо, отрицательный - влево");
        int shift = sc.nextInt(); //величина смещения
        shift %= size; //для уменьшения геммороя в дальнейшем
        sc.close(); //закрываем сканер
        System.out.println("Массив после сдвига:");

        int[] new_arr = new int[size];

        for (int i = 0; i < size; i++){
            int j;
            if (shift < 0){
                j = (-i + shift)%size;
                j *= -1;
            } else {
                j = (i + size - shift)%size;
            }
            new_arr[i] = arr[j];
            System.out.println(new_arr[i]);
        }
    }
}
