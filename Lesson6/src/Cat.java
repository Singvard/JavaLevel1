public class Cat extends Animal {

    public Cat (String name) {
        super(name);
        this.name = name;
    }

    public static int count = 0;

    public Cat(){
        count++;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run(int distanceRunCat) {
        super.run(distanceRunCat);
        if (distanceRunCat <= 200) {
            System.out.println("Кот " + name + " пробежал " + distanceRunCat + " м.");
        } else {
            System.out.println("Кот " + name + " пробежал 200 из " + distanceRunCat + " м. и устал");
        }
    }

    @Override
    public void swim(int distanceSwimCat) {
        super.swim(distanceSwimCat);
        System.out.println("Кот " + name + " утонул, т.к. коты не умеют плавать!");
    }


    public static void howMuch(){
        System.out.println("Кошек создано " + count);
    }

}
