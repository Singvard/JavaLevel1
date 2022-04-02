import java.lang.reflect.Array;

public class Lesson7 {

    public static void main(String[] args) {
        Cat cat1 = new Cat ("",0, false);
        cat1.setName("Барсик");
        cat1.setAppetite(30);
        cat1.setBellyful(false);

        Cat cat2 = new Cat ("",0, false);
        cat2.setName("Мурзик");
        cat2.setAppetite(20);
        cat2.setBellyful(false);

        Cat cat3 = new Cat ("",0, false);
        cat3.setName("Дымок");
        cat3.setAppetite(0);
        cat3.setBellyful(true);

        Cat cat4 = new Cat ("",0, false);
        cat4.setName("Пушок");
        cat4.setAppetite(40);
        cat4.setBellyful(false);

        Cat[] cats = new Cat[4];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;

        Plate plate = new Plate(0);
        plate.setFood(30);

        plate.increaseFood(50);
        plate.info();

        for (int i =0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].isBellyful());
        }
        plate.info();
    }

}
