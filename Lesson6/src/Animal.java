public class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public static int count = 0;

    public Animal(){
        count++;
    }

    public void run(int distanceRun) {
        if (distanceRun > 0 ) {
            System.out.println("Животное " + name + " начало бежать...");
        } else {
            System.out.println("Расстояние должно быть положительным числом");
            return;
        }
    }

    public void swim(int distanceSwim) {
        if (distanceSwim > 0 ) {
            System.out.println("Животное " + name + " начинает заплыв...");
        } else {
            System.out.println("Расстояние должно быть положительным числом");
            return;
        }
    }

    public static void howMuch() {
        System.out.println("Животных создано " + count);
    }
}
